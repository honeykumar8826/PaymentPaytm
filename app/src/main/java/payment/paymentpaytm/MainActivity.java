package payment.paymentpaytm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button paymentStart =  findViewById(R.id.start_transaction);
        final EditText orderid =  findViewById(R.id.orderid);
        final EditText custid = findViewById(R.id.custid);
        paymentStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String orderId = orderid.getText().toString();
                String customerId = custid.getText().toString();
                Intent intent = new Intent(MainActivity.this, ChecksumActivity.class);
                intent.putExtra("orderid", orderid.getText().toString());
                intent.putExtra("custid", custid.getText().toString());
                startActivity(intent);
            }
        });
    }
}
