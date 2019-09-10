package project;

import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.lang.*;

class Pro extends Frame implements ActionListener {

    /////////////////varable////////////////
    Panel p1, p2, p3, p4, p5; // 5 panels for adding other fields
    Label l, l1, l2, l3, l4, l5, l6,l7, cl1, cl2, cl3, cl4; //Labels for naming
    FlowLayout fl = new FlowLayout(); //Overall UI
    Button b1, b2; //Confirm and Close buttons
    String str1, str2, str3, str4, str5, str6,str7,str8,str9,str10; //Data vars
    TextField tf1, tf2, tf3, tf4, tf5, tf6; //Input fields
    Checkbox cb1;
    Choice c1, c2, c3, c4;
    float total;

    Pro() {
        //panel//
        p5 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        p1 = new Panel();
        p2 = new Panel();
        //////////////////////bg colour///////////////
        p1.setBackground(Color.RED);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.BLACK);
        p4.setBackground(Color.GRAY);
        p5.setBackground(Color.ORANGE);
        ///////////label////////////
        l = new Label(" Stock Inventroy ");
        l1 = new Label("company name");
        l2 = new Label("price");
        l3 = new Label("buy price");
        l4 = new Label("quantity");
        l5 = new Label("stop loss sell");
        l6 = new Label("Target sell");
        cl1 = new Label("complexity");
        cl2 = new Label("Order type");
        cl3 = new Label("Position");
        cl4 = new Label("Tif");
        l7 = new Label("total");
        //total=;
        
        ////////////////////textfield/////////////////
        tf1 = new TextField(30);
        tf2 = new TextField(30);
        tf3 = new TextField(30);
        tf4 = new TextField(30);
        tf5 = new TextField(30);
        tf6 = new TextField(30);
        ////////add in frame///////////
        p1.setLayout(new GridLayout(10, 50));
        p2.setLayout(new GridLayout(2, 2));
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(tf3);
        p1.add(l4);
        p1.add(tf4);
        p1.add(l5);
        p1.add(tf5);
        p1.add(l6);
        p1.add(tf6);
        ////////////////action of button ///////////////////////
        b1 = new Button("Confirm");
        b2 = new Button("Close");
        b1.addActionListener(this);
        b2.addActionListener(this);
        /////////////checkbox///////////////
        //cb1=new Checkbox();
        //p1.add(cb1);
        ///////////choice/////////////
        c1 = new Choice();
        p1.add(cl1);
        p1.add(c1);
        c1.add("Simple");
        c1.add("AMO");
        c1.add("CO");
        c1.add("OCO");
        /////////choice2///////////////
        c2 = new Choice();
        p1.add(cl2);
        p1.add(c2);
        c2.add("LIMIT");
        c2.add("SL LIMIT");
        ///////////////////////choice3///////////////
        c3 = new Choice();
        p1.add(cl3);
        p1.add(c3);
        c3.add("INTRADAY");
        c3.add("DELIVERY");
        ////////////////////choice4//////////////
        c4 = new Choice();
        p1.add(cl4);
        p1.add(c4);
        c4.add("Day");
        c4.add("IOC");
//////////////////////////panal////////////////////
        p5.setLayout(fl);
        p5.add(p1);
        p5.add(p2);
        p3.add(l);
        p4.add(b1);
        p4.add(b2);
        setLayout(new BorderLayout());
        add(p5, "Center");
        add(p3, "North");
        add(p4, "South");
        setVisible(true);
        setSize(600, 600);
        setTitle("stock inventroy");
        pack();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1)
    {
      str1=l1.getText()+":"+tf1.getText()+"\r\n";
      str2=l2.getText()+":"+tf2.getText()+"\r\n";
      str3=l3.getText()+":"+tf3.getText()+"\r\n";
      str4=l4.getText()+":"+tf4.getText()+"\r\n";
      str5=l5.getText()+":"+tf5.getText()+"\r\n";
      str6=l6.getText()+":"+tf6.getText()+"\r\n";
      str7=cl1.getText()+":"+c1.getSelectedItem()+"\r\n";
      str8=cl2.getText()+":"+c2.getSelectedItem()+"\r\n";
      str9=cl3.getText()+":"+c3.getSelectedItem()+"\r\n";
      str10=cl4.getText()+":"+c4.getSelectedItem()+"\r\n";
      byte bb1[]=str1.getBytes();
      byte bb2[]=str2.getBytes();
      byte bb3[]=str3.getBytes();
      byte bb4[]=str4.getBytes();
      byte bb5[]=str5.getBytes();
      byte bb6[]=str6.getBytes();
      byte bb7[]=str7.getBytes();
      byte bb8[]=str8.getBytes();
      byte bb9[]=str9.getBytes();
      byte bb10[]=str10.getBytes();
      
      
      
      try{

        FileOutputStream f= new FileOutputStream(tf1.getText()+".txt");
        f.write(bb1);
        f.write(bb2);
        f.write(bb3);
        f.write(bb4);
        f.write(bb5);
        f.write(bb6);
        f.write(bb7);
        f.write(bb8);
        f.write(bb9);
        f.write(bb10);
        //f.write(str1.charAt(i));
      }
      catch(Exception e)
      {
        System.out.println(e.getMessage());
      }
    }
    if(ae.getSource()==b2)
    {
      System.exit(0);
    }
    }

    public static void main(String[] args) {
        Pro n = new Pro();
    }

}
