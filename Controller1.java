package TeamMLT;

import Components.*;
import DataObjects.DataFloat;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

import java.util.ArrayList;

public class Controller1 {
    public static void main(String[] args) {
        PetriNet pn = new PetriNet();
        pn.PetriNetName = "First Controller";
        pn.SetName("First Controller");
        pn.NetworkPort = 1081;

        DataString ini = new DataString();
        ini.SetName("ini");
        ini.SetValue("red");
        pn.ConstantPlaceList.add(ini);

        DataString red = new DataString();
        red.SetName("red");
        red.SetValue("red");
        pn.ConstantPlaceList.add(red);

        DataString green = new DataString();
        green.SetName("green");
        green.SetValue("green");
        pn.ConstantPlaceList.add(green);

        DataString yellow = new DataString();
        yellow.SetName("yellow");
        yellow.SetValue("yellow");
        pn.ConstantPlaceList.add(yellow);

        DataTransfer OP1 = new DataTransfer();
        OP1.SetName("OP1");
        OP1.Value = new TransferOperation("localhost", "1080", "TL1");
        pn.PlaceList.add(OP1);

        DataTransfer OP2 = new DataTransfer();
        OP2.SetName("OP2");
        OP2.Value = new TransferOperation("localhost", "1080", "TL2");
        pn.PlaceList.add(OP2);

        DataTransfer OP3 = new DataTransfer();
        OP3.SetName("OP3");
        OP3.Value = new TransferOperation("localhost", "1080", "TL3");
        pn.PlaceList.add(OP3);

        DataTransfer OP8 = new DataTransfer();
        OP8.SetName("OP8");
        OP8.Value = new TransferOperation("localhost", "1080", "TL8");
        pn.PlaceList.add(OP8);

        DataFloat counter1 = new DataFloat();
        counter1.SetName("counter1");
        counter1.SetValue(3.0f);
        pn.PlaceList.add(counter1);

        DataFloat counter2 = new DataFloat();
        counter2.SetName("counter2");
        counter2.SetValue(3.0f);
        pn.PlaceList.add(counter2);

        DataFloat counter3 = new DataFloat();
        counter3.SetName("counter3");
        counter3.SetValue(3.0f);
        pn.PlaceList.add(counter3);

        DataFloat counter8 = new DataFloat();
        counter8.SetName("counter8");
        counter8.SetValue(3.0f);
        pn.PlaceList.add(counter8);

        DataString in1 = new DataString();
        in1.SetName("in1");
        pn.PlaceList.add(in1);

        DataString in2 = new DataString();
        in2.SetName("in2");
        pn.PlaceList.add(in2);

        DataString in3 = new DataString();
        in3.SetName("in3");
        pn.PlaceList.add(in3);

        DataString in8 = new DataString();
        in8.SetName("in8");
        pn.PlaceList.add(in8);

        DataString p1 = new DataString();
        p1.SetName("r1r2r3r4");
        p1.SetValue("signal");
        pn.PlaceList.add(p1);

        DataString p2 = new DataString();
        p2.SetName("g1r2r3r4");
        pn.PlaceList.add(p2);

        DataString p3 = new DataString();
        p3.SetName("y1r2r3r4");
        pn.PlaceList.add(p3);

        DataString p4 = new DataString();
        p4.SetName("r1g2r3r4");
        pn.PlaceList.add(p4);

        DataString p5 = new DataString();
        p5.SetName("r1y2r3r4");
        pn.PlaceList.add(p5);

        DataString p6 = new DataString();
        p6.SetName("r1r2g3r4");
        pn.PlaceList.add(p6);

        DataString p7 = new DataString();
        p7.SetName("r1r2y3r4");
        pn.PlaceList.add(p7);

        DataString p8 = new DataString();
        p8.SetName("r1r2r3g4");
        pn.PlaceList.add(p8);

        DataString p9 = new DataString();
        p9.SetName("r1r2r3y4");
        pn.PlaceList.add(p9);

        DataFloat zero = new DataFloat();
        zero.SetName("zero");
        zero.SetValue(0);
        pn.ConstantPlaceList.add(zero);

        DataFloat one = new DataFloat();
        one.SetName("one");
        one.SetValue(1);
        pn.ConstantPlaceList.add(one);

        DataFloat three = new DataFloat();
        three.SetName("three");
        three.SetValue(3);
        pn.ConstantPlaceList.add(three);


        //----------------------------iniT------------------------------------
        PetriTransition iniT = new PetriTransition(pn);
        iniT.TransitionName = "iniT";

        Condition iniTCt1 = new Condition(iniT, "ini", TransitionCondition.NotNull);

        GuardMapping grdiniT = new GuardMapping();
        grdiniT.condition = iniTCt1;

        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP1"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP2"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP3"));
        grdiniT.Activations.add(new Activation(iniT, "ini", TransitionOperation.SendOverNetwork, "OP8"));
        grdiniT.Activations.add(new Activation(iniT, "", TransitionOperation.MakeNull, "ini"));

        iniT.GuardMappingList.add(grdiniT);

        iniT.Delay = 5;
        pn.Transitions.add(iniT);

        //----------------------------T1------------------------------------
        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "T1";
        t1.InputPlaceName.add("r1r2r3r4");


        Condition T1Ct1 = new Condition(t1, "r1r2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition = T1Ct1;
        grdT1.Activations.add(new Activation(t1, "r1r2r3r4", TransitionOperation.Move, "g1r2r3r4"));
        grdT1.Activations.add(new Activation(t1, "green", TransitionOperation.SendOverNetwork, "OP1"));
        t1.GuardMappingList.add(grdT1);

        t1.Delay = 5;
        pn.Transitions.add(t1);

        //----------------------------T2------------------------------------
        PetriTransition t2 = new PetriTransition(pn);
        t2.TransitionName = "T2";
        t2.InputPlaceName.add("g1r2r3r4");
        t2.InputPlaceName.add("counter1");
        t2.InputPlaceName.add("in1");


        Condition T2Ct1 = new Condition(t2, "in1", TransitionCondition.IsNull);
        Condition T2Ct2 = new Condition(t2, "g1r2r3r4", TransitionCondition.NotNull);
        T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

        GuardMapping grdT21 = new GuardMapping();
        grdT21.condition = T2Ct1;
        grdT21.Activations.add(new Activation(t2, "y1r2r3r4", TransitionOperation.Move, "g1r2r3r4"));
        grdT21.Activations.add(new Activation(t2, "counter1", TransitionOperation.Move, "counter1"));
        grdT21.Activations.add(new Activation(t2, "yellow", TransitionOperation.SendOverNetwork, "OP1"));

        t2.GuardMappingList.add(grdT21);

        Condition T2Ct3 = new Condition(t2, "in1", TransitionCondition.NotNull);
        Condition T2Ct4 = new Condition(t2, "counter1", TransitionCondition.MoreThan, "zero");
        Condition T2Ct5 = new Condition(t2, "g1r2r3r4", TransitionCondition.NotNull);
        T2Ct3.SetNextCondition(LogicConnector.AND, T2Ct4);
        T2Ct4.SetNextCondition(LogicConnector.AND, T2Ct5);

        GuardMapping grdT22 = new GuardMapping();
        grdT22.condition = T2Ct3;
        grdT22.Activations.add(new Activation(t2, "g1r2r3r4", TransitionOperation.Move, "r1r2r3r4"));
        ArrayList<String> list = new ArrayList<String>();
        list.add("counter1");
        list.add("one");
        grdT22.Activations.add(new Activation(t2, list, TransitionOperation.Sub, "counter1"));

        t2.GuardMappingList.add(grdT22);

        Condition T2Ct6 = new Condition(t2, "counter1", TransitionCondition.Equal,"zero");
        Condition T2Ct7 = new Condition(t2, "g1r2r3r4", TransitionCondition.NotNull);
        T2Ct6.SetNextCondition(LogicConnector.AND, T2Ct7);

        GuardMapping grdT23 = new GuardMapping();
        grdT23.condition = T2Ct6;
        grdT23.Activations.add(new Activation(t2, "g1r2r3r4", TransitionOperation.Move, "y1r2r3r4"));
        grdT23.Activations.add(new Activation(t2, "three", TransitionOperation.Move, "counter1"));
        grdT23.Activations.add(new Activation(t2, "yellow", TransitionOperation.SendOverNetwork, "OP1"));

        t2.GuardMappingList.add(grdT23);

        t2.Delay = 5;
        pn.Transitions.add(t2);

        //----------------------------T3------------------------------------
        PetriTransition t3 = new PetriTransition(pn);
        t3.TransitionName = "T3";
        t3.InputPlaceName.add("y1r2r3r4");


        Condition T3Ct1 = new Condition(t2, "y1r2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT3 = new GuardMapping();
        grdT3.condition = T3Ct1;
        grdT3.Activations.add(new Activation(t3, "y1r2r3r4", TransitionOperation.Move, "r1g2r3r4"));
        grdT3.Activations.add(new Activation(t3, "red", TransitionOperation.SendOverNetwork, "OP1"));
        grdT3.Activations.add(new Activation(t3, "green", TransitionOperation.SendOverNetwork, "OP2"));

        t3.GuardMappingList.add(grdT3);

        t3.Delay = 5;
        pn.Transitions.add(t3);

        //----------------------------T4------------------------------------
        PetriTransition t4 = new PetriTransition(pn);
        t4.TransitionName = "T4";
        t4.InputPlaceName.add("r1g2r3r4");
        t4.InputPlaceName.add("counter2");
        t4.InputPlaceName.add("in2");


        Condition T4Ct1 = new Condition(t4, "in2", TransitionCondition.IsNull);
        Condition T4Ct2 = new Condition(t4, "r1g2r3r4", TransitionCondition.NotNull);
        T4Ct1.SetNextCondition(LogicConnector.AND, T4Ct2);

        GuardMapping grdT41 = new GuardMapping();
        grdT41.condition = T4Ct1;
        grdT41.Activations.add(new Activation(t4, "r1g2r3r4", TransitionOperation.Move, "r1y2r3r4"));
        grdT41.Activations.add(new Activation(t4, "yellow", TransitionOperation.SendOverNetwork, "OP2"));
        grdT41.Activations.add(new Activation(t4, "counter2", TransitionOperation.Move, "counter2"));

        t4.GuardMappingList.add(grdT41);

        Condition T4Ct3 = new Condition(t4, "in2", TransitionCondition.NotNull);
        Condition T4Ct4 = new Condition(t4, "counter2", TransitionCondition.MoreThan, "zero");
        Condition T4Ct5 = new Condition(t4, "r1g2r3r4", TransitionCondition.NotNull);
        T4Ct3.SetNextCondition(LogicConnector.AND, T4Ct4);
        T4Ct4.SetNextCondition(LogicConnector.AND, T4Ct5);

        GuardMapping grdT42 = new GuardMapping();
        grdT42.condition = T4Ct3;
        grdT42.Activations.add(new Activation(t4, "r1g2r3r4", TransitionOperation.Move, "y1r2r3r4"));
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("counter2");
        list2.add("one");
        grdT42.Activations.add(new Activation(t4, list2, TransitionOperation.Sub, "counter2"));

        t4.GuardMappingList.add(grdT42);

        Condition T4Ct6 = new Condition(t4, "counter2", TransitionCondition.Equal,"zero");
        Condition T4Ct7 = new Condition(t4, "r1g2r3r4", TransitionCondition.NotNull);
        T4Ct6.SetNextCondition(LogicConnector.AND, T4Ct7);

        GuardMapping grdT43 = new GuardMapping();
        grdT43.condition = T4Ct6;
        grdT43.Activations.add(new Activation(t4, "r1g2r3r4", TransitionOperation.Move, "r1y2r3r4"));
        grdT43.Activations.add(new Activation(t4, "three", TransitionOperation.Move, "counter2"));
        grdT43.Activations.add(new Activation(t4, "yellow", TransitionOperation.SendOverNetwork, "OP2"));

        t4.GuardMappingList.add(grdT43);

        t4.Delay = 5;
        pn.Transitions.add(t4);

        //----------------------------T5------------------------------------
        PetriTransition t5 = new PetriTransition(pn);
        t5.TransitionName = "T5";
        t5.InputPlaceName.add("r1y2r3r4");


        Condition T5Ct1 = new Condition(t5, "r1y2r3r4", TransitionCondition.NotNull);

        GuardMapping grdT5 = new GuardMapping();
        grdT5.condition = T5Ct1;
        grdT5.Activations.add(new Activation(t5, "r1y2r3r4", TransitionOperation.Move, "r1r2g3r4"));
        grdT5.Activations.add(new Activation(t5, "red", TransitionOperation.SendOverNetwork, "OP2"));
        grdT5.Activations.add(new Activation(t5, "green", TransitionOperation.SendOverNetwork, "OP3"));


        t5.GuardMappingList.add(grdT5);

        t5.Delay = 5;
        pn.Transitions.add(t5);

        //----------------------------T6------------------------------------
        PetriTransition t6 = new PetriTransition(pn);
        t6.TransitionName = "T6";
        t6.InputPlaceName.add("r1r2g3r4");
        t6.InputPlaceName.add("counter3");
        t6.InputPlaceName.add("in3");


        Condition T6Ct1 = new Condition(t4, "in3", TransitionCondition.IsNull);
        Condition T6Ct2 = new Condition(t6, "r1r2g3r4", TransitionCondition.NotNull);
        T6Ct1.SetNextCondition(LogicConnector.AND, T6Ct2);

        GuardMapping grdT61 = new GuardMapping();
        grdT61.condition = T6Ct1;
        grdT61.Activations.add(new Activation(t6, "r1r2g3r4", TransitionOperation.Move, "r1r2y3r4"));
        grdT61.Activations.add(new Activation(t6, "yellow", TransitionOperation.SendOverNetwork, "OP3"));
        grdT61.Activations.add(new Activation(t6, "counter3", TransitionOperation.Move, "counter3"));

        t6.GuardMappingList.add(grdT61);

        Condition T6Ct3 = new Condition(t6, "in3", TransitionCondition.NotNull);
        Condition T6Ct4 = new Condition(t6, "counter3", TransitionCondition.MoreThan, "zero");
        Condition T6Ct5 = new Condition(t6, "r1r2g3r4", TransitionCondition.NotNull);
        T6Ct3.SetNextCondition(LogicConnector.AND, T6Ct4);
        T6Ct4.SetNextCondition(LogicConnector.AND, T6Ct5);

        GuardMapping grdT62 = new GuardMapping();
        grdT62.condition = T6Ct3;
        grdT62.Activations.add(new Activation(t6, "r1r2g3r4", TransitionOperation.Move, "r1y2r3r4"));
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("counter3");
        list3.add("one");
        grdT62.Activations.add(new Activation(t6, list3, TransitionOperation.Sub, "counter3"));

        t6.GuardMappingList.add(grdT62);

        Condition T6Ct6 = new Condition(t6, "counter3", TransitionCondition.Equal,"zero");
        Condition T6Ct7 = new Condition(t6, "r1r2g3r4", TransitionCondition.NotNull);
        T6Ct6.SetNextCondition(LogicConnector.AND, T6Ct7);

        GuardMapping grdT63 = new GuardMapping();
        grdT63.condition = T6Ct6;
        grdT63.Activations.add(new Activation(t6, "r1r2g3r4", TransitionOperation.Move, "r1r2y3r4"));
        grdT63.Activations.add(new Activation(t6, "three", TransitionOperation.Move, "counter3"));
        grdT63.Activations.add(new Activation(t6, "yellow", TransitionOperation.SendOverNetwork, "OP3"));

        t6.GuardMappingList.add(grdT63);

        t6.Delay = 5;
        pn.Transitions.add(t6);

        //----------------------------T7------------------------------------
        PetriTransition t7 = new PetriTransition(pn);
        t7.TransitionName = "T7";
        t7.InputPlaceName.add("r1r2y3r4");


        Condition T7Ct1 = new Condition(t7, "r1r2y3r4", TransitionCondition.NotNull);

        GuardMapping grdT7 = new GuardMapping();
        grdT7.condition = T7Ct1;
        grdT7.Activations.add(new Activation(t7, "r1r2y3r4", TransitionOperation.Move, "r1r2r3g4"));
        grdT7.Activations.add(new Activation(t7, "red", TransitionOperation.SendOverNetwork, "OP3"));
        grdT7.Activations.add(new Activation(t7, "green", TransitionOperation.SendOverNetwork, "OP8"));


        t7.GuardMappingList.add(grdT7);

        t7.Delay = 5;
        pn.Transitions.add(t7);

        //----------------------------T8------------------------------------
        PetriTransition t8 = new PetriTransition(pn);
        t8.TransitionName = "T8";
        t8.InputPlaceName.add("r1r2r3g4");
        t8.InputPlaceName.add("counter8");
        t8.InputPlaceName.add("in8");


        Condition T8Ct1 = new Condition(t4, "in8", TransitionCondition.IsNull);
        Condition T8Ct2 = new Condition(t8, "r1r2r3g4", TransitionCondition.NotNull);
        T8Ct1.SetNextCondition(LogicConnector.AND, T8Ct2);

        GuardMapping grdT81 = new GuardMapping();
        grdT81.condition = T8Ct1;
        grdT81.Activations.add(new Activation(t8, "r1r2r3g4", TransitionOperation.Move, "r1r2r3y4"));
        grdT81.Activations.add(new Activation(t8, "yellow", TransitionOperation.SendOverNetwork, "OP8"));
        grdT81.Activations.add(new Activation(t8, "counter8", TransitionOperation.Move, "counter8"));

        t8.GuardMappingList.add(grdT81);

        Condition T8Ct3 = new Condition(t8, "in8", TransitionCondition.NotNull);
        Condition T8Ct4 = new Condition(t8, "counter8", TransitionCondition.MoreThan, "zero");
        Condition T8Ct5 = new Condition(t8, "r1r2r3g4", TransitionCondition.NotNull);
        T8Ct3.SetNextCondition(LogicConnector.AND, T8Ct4);
        T8Ct4.SetNextCondition(LogicConnector.AND, T8Ct5);

        GuardMapping grdT82 = new GuardMapping();
        grdT82.condition = T8Ct3;
        grdT82.Activations.add(new Activation(t8, "r1r2r3g4", TransitionOperation.Move, "r1r2y3r4"));
        ArrayList<String> list4 = new ArrayList<String>();
        list4.add("counter8");
        list4.add("one");
        grdT82.Activations.add(new Activation(t8, list4, TransitionOperation.Sub, "counter8"));

        t8.GuardMappingList.add(grdT82);

        Condition T8Ct6 = new Condition(t8, "counter8", TransitionCondition.Equal,"zero");
        Condition T8Ct7 = new Condition(t8, "r1r2r3g4", TransitionCondition.NotNull);
        T8Ct6.SetNextCondition(LogicConnector.AND, T8Ct7);

        GuardMapping grdT83 = new GuardMapping();
        grdT83.condition = T8Ct6;
        grdT83.Activations.add(new Activation(t8, "r1r2r3g4", TransitionOperation.Move, "r1r2r3y4"));
        grdT83.Activations.add(new Activation(t8, "three", TransitionOperation.Move, "counter8"));
        grdT83.Activations.add(new Activation(t8, "yellow", TransitionOperation.SendOverNetwork, "OP8"));

        t8.GuardMappingList.add(grdT83);

        t8.Delay = 5;
        pn.Transitions.add(t8);

        //----------------------------T9------------------------------------
        PetriTransition t9 = new PetriTransition(pn);
        t9.TransitionName = "T9";
        t9.InputPlaceName.add("r1r2r3y4");


        Condition T9Ct1 = new Condition(t9, "r1r2r3y4", TransitionCondition.NotNull);

        GuardMapping grdT9 = new GuardMapping();
        grdT9.condition = T9Ct1;
        grdT9.Activations.add(new Activation(t9, "r1r2r3y4", TransitionOperation.Move, "r1r2r3r4"));
        grdT9.Activations.add(new Activation(t9, "red", TransitionOperation.SendOverNetwork, "OP8"));


        t9.GuardMappingList.add(grdT9);

        t9.Delay = 5;
        pn.Transitions.add(t9);


        // -------------------------------------------------------------------------------------
        // ----------------------------PN Start-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Exp1 started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);



    }
}
