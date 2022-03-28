package com.example.trainingapp.View;

import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BoxLayout;
import com.example.trainingapp.Controller.*;

public class LoginFrame {
    private Controller controller;

    public LoginFrame(Controller controller) {
        this.controller = controller;
        loginFrame();
    }

    public void loginFrame() {
        Form hi = new Form("Test", BoxLayout.y());
        Button helloButton = new Button("Test");
        hi.add(helloButton);
        hi.show();
    }
}
