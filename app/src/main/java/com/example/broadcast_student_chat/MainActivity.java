package com.example.broadcast_student_chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
   ImageView SelectMaterial;
   ImageButton cameraOn,cameraOff,micbtn,mutebtn,callbtn,morebtn;
   ConstraintLayout constraintLayout1,visible_constraint,cons_grid,cons_2;
   GridLayout gridLayout;
   TextView camofftextView,camontextview,micontv,micofftv,leavetv,moretv,subnametv,std_sub_tv,std_sub_tv2;
   Button hidebtn;
   RelativeLayout relativehide;
   Dialog dialog;
    int c = 0;
   boolean isDisplaying = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        cameraOn = findViewById(R.id.CameraOn);
        cameraOff = findViewById(R.id.CameraOff);
        micbtn = findViewById(R.id.micbtn);
        mutebtn = findViewById(R.id.mutebtn);
        constraintLayout1 = findViewById(R.id.constraintlayout1);
        cons_2 = findViewById(R.id.cons2);
        gridLayout = findViewById(R.id.gridView);
        hidebtn = findViewById(R.id.hidebtn);
       camofftextView = findViewById(R.id.camofftextView);
       camontextview = findViewById(R.id.camontextView);
       micontv = findViewById(R.id.micontextView);
        micofftv = findViewById(R.id.micofftextView);
        visible_constraint = findViewById(R.id.visible_constraint);
        callbtn = findViewById(R.id.callbtn);
        leavetv = findViewById(R.id.leavetextView3);
        morebtn = findViewById(R.id.morebtn);
        moretv = findViewById(R.id.moretextView5);
        subnametv = findViewById(R.id.SubjectName_tv);
        std_sub_tv = findViewById(R.id.Standard_sub_tv);
        std_sub_tv2 = findViewById(R.id.standrad_sub_tv2);
        relativehide = findViewById(R.id.relativehide);
        dialog = new Dialog(this);

        morebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater lInflater = (LayoutInflater) getApplication().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View popup_view = lInflater.inflate(R.layout.popwindow1, null);
                final PopupWindow popup = new PopupWindow(popup_view,400,400,true);
                popup.setFocusable(true);
                popup.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));;
                popup.showAsDropDown(morebtn,-415,210);
            }
        });


    cameraOn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cameraOn.setVisibility(View.GONE);
            cameraOff.setVisibility(View.VISIBLE);
            micbtn.setVisibility(View.GONE);
            mutebtn.setVisibility(View.VISIBLE);
            gridLayout.setVisibility(View.INVISIBLE);
            camontextview.setVisibility(View.GONE);
            camofftextView.setVisibility(View.VISIBLE);
            micontv.setVisibility(View.GONE);
            micofftv.setVisibility(View.VISIBLE);
        }
    });


    hidebtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (isDisplaying){
                relativehide.setVisibility(View.VISIBLE);

            }else {
                relativehide.setVisibility(View.INVISIBLE);
            }
            isDisplaying=!isDisplaying;

        }
    });
    mutebtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cameraOn.setVisibility(View.VISIBLE);
            cameraOff.setVisibility(View.GONE);
            micbtn.setVisibility(View.VISIBLE);
            mutebtn.setVisibility(View.GONE);
            gridLayout.setVisibility(View.VISIBLE);
            camontextview.setVisibility(View.VISIBLE);
            camofftextView.setVisibility(View.GONE);
            micontv.setVisibility(View.VISIBLE);
            micofftv.setVisibility(View.GONE);
        }
    });
    visible_constraint.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            c++;
            if (c%2==0){
                YoYo.with(Techniques.SlideInUp).duration(600).repeat(0).playOn(cameraOn);
                YoYo.with(Techniques.SlideInUp).duration(600).repeat(0).playOn(camontextview);
                YoYo.with(Techniques.SlideInUp).duration(600).repeat(0).playOn(callbtn);
                YoYo.with(Techniques.SlideInUp).duration(600).repeat(0).playOn(micbtn);
                YoYo.with(Techniques.SlideInUp).duration(600).repeat(0).playOn(leavetv);
                YoYo.with(Techniques.SlideInUp).duration(600).repeat(0).playOn(micontv);
                YoYo.with(Techniques.SlideInUp).duration(600).repeat(0).playOn(moretv);
                YoYo.with(Techniques.SlideInUp).duration(600).repeat(0).playOn(morebtn);
                YoYo.with(Techniques.SlideInUp).duration(600).repeat(0).playOn(subnametv);
                YoYo.with(Techniques.SlideInUp).duration(600).repeat(0).playOn(std_sub_tv);
                YoYo.with(Techniques.SlideInUp).duration(600).repeat(0).playOn(std_sub_tv2);
                YoYo.with(Techniques.SlideInDown).duration(600).repeat(0).playOn(constraintLayout1);
                YoYo.with(Techniques.SlideInDown).duration(600).repeat(0).playOn(cons_2);

            }
            else {
                YoYo.with(Techniques.SlideOutDown).duration(600).repeat(0).playOn(cameraOn);
                YoYo.with(Techniques.SlideOutDown).duration(600).repeat(0).playOn(camontextview);
                YoYo.with(Techniques.SlideOutDown).duration(600).repeat(0).playOn(callbtn);
                YoYo.with(Techniques.SlideOutDown).duration(600).repeat(0).playOn(leavetv);
                YoYo.with(Techniques.SlideOutDown).duration(600).repeat(0).playOn(micbtn);
                YoYo.with(Techniques.SlideOutDown).duration(600).repeat(0).playOn(micontv);
                YoYo.with(Techniques.SlideOutDown).duration(600).repeat(0).playOn(morebtn);
                YoYo.with(Techniques.SlideOutDown).duration(600).repeat(0).playOn(moretv);
                YoYo.with(Techniques.SlideOutDown).duration(600).repeat(0).playOn(subnametv);
                YoYo.with(Techniques.SlideOutDown).duration(600).repeat(0).playOn(std_sub_tv);
                YoYo.with(Techniques.SlideOutDown).duration(600).repeat(0).playOn(std_sub_tv2);
                YoYo.with(Techniques.SlideOutUp).duration(600).repeat(0).playOn(constraintLayout1);
                YoYo.with(Techniques.SlideOutUp).duration(600).repeat(0).playOn(cons_2);

            }


        }
    });


    }




}

