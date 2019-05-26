package com.example.sem_prace_2;

import android.os.Handler;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int img1,img2,img3,img4,img5,img6;
    int obs1,obs2,obs3,obs4,obs5,obs6;
    int i=0;    int ii=0;    int iii=0;    int iiii=0;    int iiiii=0;    int iiiiii=0;
    int pocetOtoceni=0,pocOtoParu=0,karta1=0,klik=1;
//    Toast toastVyhrals= Toast.makeText(this,"Gratuluji, vyhrál jsi za: "+pocetOtoceni+" tahů.",Toast.LENGTH_LONG);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0,0,0,"Reset");
        menu.add(0,1,1,"Konec");
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId()){
            case 0:
                reset();
                return true;
            case 1:
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                return true;
        }
        return false;
    }

    public void reset(){
        pocetOtoceni=pocOtoParu=karta1=0;klik=1;
        ImageView imageView6=(ImageView)findViewById(R.id.imageView6);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        i=ii=iii=iiii=iiiii=iiiiii=0;
        obs1=obs2=obs3=obs4=obs5=obs6=8;
        img1=img2=img3=img4=img5=img6=R.drawable.cr;
        imageView6.setImageResource(R.drawable.cr);
        imageView.setImageResource(R.drawable.cr);
        imageView2.setImageResource(R.drawable.cr);
        imageView3.setImageResource(R.drawable.cr);
        imageView4.setImageResource(R.drawable.cr);
        imageView5.setImageResource(R.drawable.cr);
    }
    public void otoceni(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                pocOtoParu=karta1=0;
                klik=1;
                ImageView imageView6=(ImageView)findViewById(R.id.imageView6);
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
                ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
                ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
                ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
                imageView6.setImageResource(R.drawable.cr);
                imageView.setImageResource(R.drawable.cr);
                imageView2.setImageResource(R.drawable.cr);
                imageView3.setImageResource(R.drawable.cr);
                imageView4.setImageResource(R.drawable.cr);
                imageView5.setImageResource(R.drawable.cr);
            }
        },1000);

    }

    public void click(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        pocetOtoceni++;
        if (klik==1){
            imageView.setImageResource(img1);

            klik++;
            karta1=img1;
        }else if (klik==2){
            klik=1;
            imageView.setImageResource(img1);
            if (karta1==img1){
                pocOtoParu++;

                if (pocOtoParu==3){
                    Toast.makeText(this,"Gratuluji, vyhrál jsi za: "+pocetOtoceni+" tahů.",Toast.LENGTH_LONG).show();
                }
            }else {
                otoceni();
            }
        }/*
        i++;

        if (i==1){
            imageView.setImageResource(img1);
            pocetOtoceni++;
        }else {
            imageView.setImageResource(R.drawable.cr);
            i=0;
        }*/

    }
    public void click2(View view) {
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        pocetOtoceni++;
        if (klik==1){
            imageView2.setImageResource(img2);

            klik++;
            karta1=img2;
        }else if (klik==2){
            klik=1;
            imageView2.setImageResource(img2);
            if (karta1==img2){
                pocOtoParu++;
                if (pocOtoParu==3){
                    Toast.makeText(this,"Gratuluji, vyhrál jsi za: "+pocetOtoceni+" tahů.",Toast.LENGTH_LONG).show();
                }
            }else {
                otoceni();
            }
        }
        /*ii++;
        if (ii==1){
            imageView2.setImageResource(img2);
            pocetOtoceni++;
        }else {
            imageView2.setImageResource(R.drawable.cr);
            ii=0;
        }*/
    }
    public void click3(View view) {
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        pocetOtoceni++;
        if (klik==1){
            imageView3.setImageResource(img3);

            klik++;
            karta1=img3;
        }else if (klik==2){
            klik=1;
            imageView3.setImageResource(img3);
            if (karta1==img3){
                pocOtoParu++;
                if (pocOtoParu==3){
                    Toast.makeText(this,"Gratuluji, vyhrál jsi za: "+pocetOtoceni+" tahů.",Toast.LENGTH_LONG).show();
                }
            }else {
                otoceni();
            }
        }
        /*iii++;
        if (iii==1){
            imageView3.setImageResource(img3);
            pocetOtoceni++;
        }else {
            imageView3.setImageResource(R.drawable.cr);
            iii=0;
        }*/
    }
    public void click4(View view) {
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        pocetOtoceni++;
        if (klik==1){
            imageView4.setImageResource(img4);

            klik++;
            karta1=img4;
        }else if (klik==2){
            klik=1;
            imageView4.setImageResource(img4);
            if (karta1==img4){
                pocOtoParu++;
                if (pocOtoParu==3){
                    Toast.makeText(this,"Gratuluji, vyhrál jsi za: "+pocetOtoceni+" tahů.",Toast.LENGTH_LONG).show();
                }
            }else {
                otoceni();
            }
        }
        /*iiii++;
        if (iiii==1){
            imageView4.setImageResource(img4);
            pocetOtoceni++;
        }else {
            imageView4.setImageResource(R.drawable.cr);
            iiii=0;
        }*/
    }
    public void click5(View view) {
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        pocetOtoceni++;
        if (klik==1){
            imageView5.setImageResource(img5);

            klik++;
            karta1=img5;
        }else if (klik==2){
            klik=1;
            imageView5.setImageResource(img5);
            if (karta1==img5){
                pocOtoParu++;
                if (pocOtoParu==3){
                    Toast.makeText(this,"Gratuluji, vyhrál jsi za: "+pocetOtoceni+" tahů.",Toast.LENGTH_LONG).show();
                }
            }else {
                otoceni();
            }
        }
        /*iiiii++;
        if (iiiii==1){
            imageView5.setImageResource(img5);
            pocetOtoceni++;
        }else {
            imageView5.setImageResource(R.drawable.cr);
            iiiii=0;
        }*/
    }
    public void click6(View view) {
        ImageView imageView6=(ImageView)findViewById(R.id.imageView6);
        pocetOtoceni++;
        if (klik==1){
            imageView6.setImageResource(img6);

            klik++;
            karta1=img6;
        }else if (klik==2){
            klik=1;
            imageView6.setImageResource(img6);
            if (karta1==img6){
                pocOtoParu++;
                if (pocOtoParu==3){
                    Toast.makeText(this,"Gratuluji, vyhrál jsi za: "+pocetOtoceni+" tahů.",Toast.LENGTH_LONG).show();
                }
            }else {
                otoceni();
            }
        }
        /*iiiiii++;
        if (iiiiii==1){
            imageView6.setImageResource(img6);
            pocetOtoceni++;
        }else {
            imageView6.setImageResource(R.drawable.cr);
            iiiiii=0;
        }*/
    }

    public void btn(View view) {
        reset();
        /*obs1=obs2=obs3=obs4=obs5=obs6=8;
        img1=img2=img3=img4=img5=img6=R.drawable.cr;*/
        Random random = new Random();
        int r1=0;
        int r2=0;
        boolean par1=false;
        boolean par2=false;
        boolean par3=false;

        while (!par1){//tabor
            r1=random.nextInt(6);

            switch (r1){
                case 0:
                    img1=R.drawable.tabor;
                    obs1=r1;
                    break;
                case 1:
                    img2=R.drawable.tabor;
                    obs2=r1;
                    break;
                case 2:
                    img3=R.drawable.tabor;
                    obs3=r1;
                    break;
                case 3:
                    img4=R.drawable.tabor;
                    obs4=r1;
                    break;
                case 4:
                    img5=R.drawable.tabor;
                    obs5=r1;
                    break;
                case 5:
                    img6=R.drawable.tabor;
                    obs6=r1;
                    break;
                default:
                    Toast.makeText(this,"Nastala chyba pri r1 par1",Toast.LENGTH_LONG).show();
                    break;
            }
            r2=random.nextInt(6);
            while (r1==r2){
                r2=random.nextInt(6);
            }
            switch (r2){
                case 0:
                    img1=R.drawable.tabor;
                    obs1=r2;
                    par1=true;
                    break;
                case 1:
                    img2=R.drawable.tabor;
                    obs2=r2;
                    par1=true;
                    break;
                case 2:
                    img3=R.drawable.tabor;
                    obs3=r2;
                    par1=true;
                    break;
                case 3:
                    img4=R.drawable.tabor;
                    obs4=r2;
                    par1=true;
                    break;
                case 4:
                    img5=R.drawable.tabor;
                    obs5=r2;
                    par1=true;
                    break;
                case 5:
                    img6=R.drawable.tabor;
                    obs6=r2;
                    par1=true;
                    break;
                default:
                    Toast.makeText(this,"Nastala chyba pri r2 par1",Toast.LENGTH_LONG).show();
                    break;
            }
        }
        while (!par2){//plzen
            r1=random.nextInt(6);
            while(r1==obs1 || r1==obs2 || r1==obs3 || r1==obs4 || r1==obs5 || r1==obs6){
                r1=random.nextInt(6);
            }
            switch (r1){
                case 0:
                    img1=R.drawable.plzen;
                    obs1=r1;
                    break;
                case 1:
                    img2=R.drawable.plzen;
                    obs2=r1;
                    break;
                case 2:
                    img3=R.drawable.plzen;
                    obs3=r1;
                    break;
                case 3:
                    img4=R.drawable.plzen;
                    obs4=r1;
                    break;
                case 4:
                    img5=R.drawable.plzen;
                    obs5=r1;
                    break;
                case 5:
                    img6=R.drawable.plzen;
                    obs6=r1;
                    break;
                default:
                    Toast.makeText(this,"Nastala chyba pri r1 par2",Toast.LENGTH_LONG).show();
                    break;
            }
            r2=random.nextInt(6);
            while (r1==r2 || r2==obs1 || r2==obs2 || r2==obs3 || r2==obs4 || r2==obs5 || r2==obs6){
                r2=random.nextInt(6);
            }
            switch (r2){
                case 0:
                    img1=R.drawable.plzen;
                    obs1=r2;
                    par2=true;
                    break;
                case 1:
                    img2=R.drawable.plzen;
                    obs2=r2;
                    par2=true;
                    break;
                case 2:
                    img3=R.drawable.plzen;
                    obs3=r2;
                    par2=true;
                    break;
                case 3:
                    img4=R.drawable.plzen;
                    obs4=r2;
                    par2=true;
                    break;
                case 4:
                    img5=R.drawable.plzen;
                    obs5=r2;
                    par2=true;
                    break;
                case 5:
                    img6=R.drawable.plzen;
                    obs6=r2;
                    par2=true;
                    break;
                default:
                    Toast.makeText(this,"Nastala chyba pri r2 par2",Toast.LENGTH_LONG).show();
                    break;
            }
        }

        while (!par3){//pardubice
            r1=random.nextInt(6);
            while(r1==obs1 || r1==obs2 || r1==obs3 || r1==obs4 || r1==obs5 || r1==obs6){
                r1=random.nextInt(6);
            }
            switch (r1){
                case 0:
                    img1=R.drawable.pardubice;
                    obs1=r1;
                    break;
                case 1:
                    img2=R.drawable.pardubice;
                    obs2=r1;
                    break;
                case 2:
                    img3=R.drawable.pardubice;
                    obs3=r1;
                    break;
                case 3:
                    img4=R.drawable.pardubice;
                    obs4=r1;
                    break;
                case 4:
                    img5=R.drawable.pardubice;
                    obs5=r1;
                    break;
                case 5:
                    img6=R.drawable.pardubice;
                    obs6=r1;
                    break;
                default:
                    Toast.makeText(this,"Nastala chyba pri r1 par3",Toast.LENGTH_LONG).show();
                    break;
            }
            r2=random.nextInt(6);
            while (r1==r2 || r2==obs1 || r2==obs2 || r2==obs3 || r2==obs4 || r2==obs5 || r2==obs6){
                r2=random.nextInt(6);
            }
            switch (r2){
                case 0:
                    img1=R.drawable.pardubice;
                    obs1=r2;
                    par3=true;
                    break;
                case 1:
                    img2=R.drawable.pardubice;
                    obs2=r2;
                    par3=true;
                    break;
                case 2:
                    img3=R.drawable.pardubice;
                    obs3=r2;
                    par3=true;
                    break;
                case 3:
                    img4=R.drawable.pardubice;
                    obs4=r2;
                    par3=true;
                    break;
                case 4:
                    img5=R.drawable.pardubice;
                    obs5=r2;
                    par3=true;
                    break;
                case 5:
                    img6=R.drawable.pardubice;
                    obs6=r2;
                    par3=true;
                    break;
                default:
                    Toast.makeText(this,"Nastala chyba pri r2 par3",Toast.LENGTH_LONG).show();
                    break;
            }
        }





    }
}
