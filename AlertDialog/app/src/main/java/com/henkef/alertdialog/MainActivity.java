package com.henkef.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view){

        //Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configurar titulos e mensagem
        dialog.setTitle("Título da dialog");
        dialog.setMessage("Mensagem da Dialog");

        //Configurar cancelamento
        dialog.setCancelable(false);  //se eu colocar essa opção como true após a abertura do dialog é possivel cancelar e não responder, caso ponha em false, se o dialog for aberto é obrigatorio responder. obs true é o padrão

        //Configurar icone
        dialog.setIcon( android.R.drawable.ic_dialog_alert);

        //configura ações para sim e não
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getApplicationContext(), "Executar ação ao clicar no botão Sim", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getApplicationContext(), "Executar ação ao clicar no botão Não", Toast.LENGTH_SHORT).show();
            }
        });

        //Criar e exibe AlertDialog
        dialog.create();
        dialog.show();

    }
}