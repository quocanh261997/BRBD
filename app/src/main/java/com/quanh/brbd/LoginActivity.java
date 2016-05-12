package com.quanh.brbd;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class LoginActivity extends AppCompatActivity {
    private static String SOAP_ACTION2 = "http://ws/BookizeWS/RegisterRequest";
    private static String SOAP_ACTION1 = "http://ws/BookizeWS/LoginRequest";
    private static String SOAP_ACTION3 = "http://ws/BookizeWS/helloRequest";
    private static String NAMESPACE = "http://ws/";
    private static String METHOD_NAME1 = "Login";
    private static String METHOD_NAME2 = "Register";
    private static String URL = "http://localhost:8080/Bookize/BookizeWS?wsdl";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Login(View view){
        SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME1);

        //Use this to add parameters
        //request.addProperty("Fahrenheit",txtFar.getText().toString());

        //Declare the version of the SOAP request
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);

        envelope.setOutputSoapObject(request);
        envelope.dotNet = true;

        try {
            HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

            //this is the actual part that will call the webservice
            androidHttpTransport.call(SOAP_ACTION1, envelope);

            // Get the SoapResult from the envelope body.
            SoapObject result = (SoapObject)envelope.bodyIn;

            if(result != null)
            {
                //Get the first property and change the label text
                ((TextView)findViewById()).setText(result.getProperty(0).toString());
            }
            else
            {
                //Toast.makeText(, "No Response",Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
