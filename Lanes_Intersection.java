package TeamMLT;

import Components.*;
import DataObjects.DataCar;
import DataObjects.DataCarQueue;
import DataObjects.DataString;
import DataObjects.DataTransfer;
import DataOnly.TransferOperation;
import Enumerations.LogicConnector;
import Enumerations.TransitionCondition;
import Enumerations.TransitionOperation;

public class Lanes_Intersection {
    public static void main(String[] args) {

        PetriNet pn = new PetriNet();
        pn.PetriNetName = "Lanes Intersection";

        pn.NetworkPort = 1080;

        DataString green = new DataString();
        green.Printable = false;
        green.SetName("green");
        green.SetValue("green");
        pn.ConstantPlaceList.add(green);

        DataString full = new DataString();
        full.SetName("full");
        full.SetValue("full");
        full.Printable = true;
        pn.ConstantPlaceList.add(full);


        // -------------------------------------------------------------------------------------------------------------
        // -------------------------------Intersection 1-----------------------------------------------------------------
        // -------------------------------------------------------------------------------------------------------------


        // -------------------------------------------------------------------------------------------------------------
        // -------------------------------Input Lane 1-------------------------------------------------------------------------
        // -------------------------------------------------------------------------------------------------------------

        DataCar p1 = new DataCar();
        p1.SetName("P1");
        pn.PlaceList.add(p1);

        DataCarQueue p2 = new DataCarQueue();
        p2.Value.Size = 3;
        p2.SetName("P2");
        pn.PlaceList.add(p2);

        DataString tl1 = new DataString();
        tl1.SetName("TL1");
        pn.PlaceList.add(tl1);

        DataCar p3 = new DataCar();
        p3.SetName("P3");
        pn.PlaceList.add(p3);

        DataTransfer op1 = new DataTransfer();
        op1.SetName("OP1");
        op1.Value = new TransferOperation("localhost", "1081", "in1");
        pn.PlaceList.add(op1);


        // ------------------------------------------------------------------------------------------------------------
        // --------------------------------Input Lane 2-----------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCar p5 = new DataCar();
        p5.SetName("P5");
        pn.PlaceList.add(p5);

        DataCarQueue p6 = new DataCarQueue(); 
        p6.Value.Size = 3;
        p6.SetName("P6");
        pn.PlaceList.add(p6);

        DataString tl2 = new DataString();
        tl2.SetName("TL2");
        pn.PlaceList.add(tl2);

        DataCar p7 = new DataCar(); 
        p7.SetName("P7");
        pn.PlaceList.add(p7);

        DataTransfer op2 = new DataTransfer();
        op2.SetName("OP2");
        op2.Value = new TransferOperation("localhost", "1081", "in2");
        pn.PlaceList.add(op2);

        // ------------------------------------------------------------------------------------------------------------
        // --------------------------------Input Lane 3-----------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

		DataCar p10 = new DataCar();
		p10.SetName("P10");
		pn.PlaceList.add(p10);

		DataCarQueue p11 = new DataCarQueue();
		p11.Value.Size = 3;
		p11.SetName("P11");
		pn.PlaceList.add(p11);

		DataString tl3 = new DataString();
		tl3.SetName("TL3");
		pn.PlaceList.add(tl3);

		DataCar p12 = new DataCar();
		p12.SetName("P12");
		pn.PlaceList.add(p12);

		DataTransfer op3 = new DataTransfer();
		op3.SetName("OP3");
	    op3.Value = new TransferOperation("localhost","1081","in3");
		pn.PlaceList.add(op3);

        // ------------------------------------------------------------------------------------------------------------
        // --------------------------------Input Lane 4-----------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCarQueue p27 = new DataCarQueue();
        p27.Value.Size = 3;
        p27.SetName("P27");
        pn.PlaceList.add(p27);

        DataString tl8 = new DataString();
        tl8.SetName("TL8");
        pn.PlaceList.add(tl8);

        DataCar p28 = new DataCar();
        p28.SetName("P28");
        pn.PlaceList.add(p28);

        DataTransfer op8 = new DataTransfer();
        op8.SetName("OP8");
        op8.Value = new TransferOperation("localhost", "1081", "in8");
        pn.PlaceList.add(op8);


        // ------------------------------------------------------------------------------------------------------------
        // ----------------------------Exit lane 1---------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCarQueue p4 = new DataCarQueue();
        p4.Value.Size = 3;
        p4.SetName("P4");
        pn.PlaceList.add(p4);

        DataCar p29 = new DataCar();
        p29.SetName("P29");
        pn.PlaceList.add(p29);


        // ------------------------------------------------------------------------------------------------------------
        // ----------------------------Exit lane 2---------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCarQueue p8 = new DataCarQueue();
        p8.Value.Size = 3;
        p8.SetName("P8");
        pn.PlaceList.add(p8);

        DataCar p30 = new DataCar();
        p30.SetName("P30");
        pn.PlaceList.add(p30);

        // ------------------------------------------------------------------------------------------------------------
        // ----------------------------Exit lane 3---------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCarQueue p9 = new DataCarQueue();
        p9.Value.Size = 3;
        p9.SetName("P9");
        pn.PlaceList.add(p9);

        DataCar p31 = new DataCar();
        p31.SetName("P31");
        pn.PlaceList.add(p31);


        // ------------------------------------------------------------------------------------------------------------
        // ----------------------------Exit lane 4---------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCar p14 = new DataCar();
        p14.SetName("P14");
        pn.PlaceList.add(p14);

        DataString tl7 = new DataString();
        tl7.SetName("TL7");
        pn.PlaceList.add(tl7);

        DataCarQueue p13 = new DataCarQueue();
        p13.Value.Size=3;
        p13.SetName("P13");
        pn.PlaceList.add(p13);

        DataTransfer op7 = new DataTransfer();
        op7.SetName("OP7");
        op7.Value = new TransferOperation("localhost", "1081", "in7");
        pn.PlaceList.add(op7);

        // ------------------------------------------------------------------------------------------------------------
        // --------------------------------Intersection----------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCarQueue p0 = new DataCarQueue();
        p0.Value.Size = 3;
        p0.SetName("P0");
        pn.PlaceList.add(p0);


        // -------------------------------------------------------------------------------------------------------------
        // -------------------------------Intersection 2-----------------------------------------------------------------
        // -------------------------------------------------------------------------------------------------------------

        // -------------------------------------------------------------------------------------------------------------
        // -------------------------------Input Lane 1-------------------------------------------------------------------------
        // -------------------------------------------------------------------------------------------------------------

        DataCar p16 = new DataCar();
        p16.SetName("P16");
        pn.PlaceList.add(p16);

        DataCarQueue p17 = new DataCarQueue();
        p17.Value.Size = 3;
        p17.SetName("P17");
        pn.PlaceList.add(p17);

        DataString tl4 = new DataString();
        tl4.SetName("TL4");
        pn.PlaceList.add(tl4);

        DataCar p18 = new DataCar();
        p18.SetName("P18");
        pn.PlaceList.add(p18);

        DataTransfer op4 = new DataTransfer();
        op4.SetName("OP4");
        op4.Value = new TransferOperation("localhost", "1081", "in4");
        pn.PlaceList.add(op4);


        // ------------------------------------------------------------------------------------------------------------
        // --------------------------------Input Lane 2-----------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCar p19 = new DataCar();
        p19.SetName("P19");
        pn.PlaceList.add(p19);

        DataCarQueue p20 = new DataCarQueue();
        p20.Value.Size = 3;
        p20.SetName("P20");
        pn.PlaceList.add(p20);

        DataString tl5 = new DataString();
        tl5.SetName("TL5");
        pn.PlaceList.add(tl5);

        DataCar p21 = new DataCar();
        p21.SetName("P21");
        pn.PlaceList.add(p21);

        DataTransfer op5 = new DataTransfer();
        op5.SetName("OP5");
        op5.Value = new TransferOperation("localhost", "1081", "in5");
        pn.PlaceList.add(op5);

        // ------------------------------------------------------------------------------------------------------------
        // --------------------------------Input Lane 3-----------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCar p23 = new DataCar();
        p23.SetName("P23");
        pn.PlaceList.add(p23);

        DataCarQueue p24 = new DataCarQueue();
        p24.Value.Size = 3;
        p24.SetName("P24");
        pn.PlaceList.add(p24);

        DataString tl6 = new DataString();
        tl6.SetName("TL6");
        pn.PlaceList.add(tl6);

        DataCar p25 = new DataCar();
        p25.SetName("P25");
        pn.PlaceList.add(p25);

        DataTransfer op6 = new DataTransfer();
        op6.SetName("OP6");
        op6.Value = new TransferOperation("localhost","1081","in6");
        pn.PlaceList.add(op6);



        // ------------------------------------------------------------------------------------------------------------
        // ----------------------------Exit lane 2---------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCarQueue p22 = new DataCarQueue();
        p22.Value.Size = 3;
        p22.SetName("P22");
        pn.PlaceList.add(p22);

        DataCar p32 = new DataCar();
        p32.SetName("P33");
        pn.PlaceList.add(p32);

        // ------------------------------------------------------------------------------------------------------------
        // ----------------------------Exit lane 3---------------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCarQueue p26 = new DataCarQueue();
        p26.Value.Size = 3;
        p26.SetName("P26");
        pn.PlaceList.add(p26);

        DataCar p33 = new DataCar();
        p33.SetName("P33");
        pn.PlaceList.add(p33);


        // ------------------------------------------------------------------------------------------------------------
        // --------------------------------Intersection----------------------------------------------------------------
        // ------------------------------------------------------------------------------------------------------------

        DataCarQueue p15 = new DataCarQueue();
        p15.Value.Size = 3;
        p15.SetName("P15");
        pn.PlaceList.add(p15);



        // -------------------------------------------------------------------------------------------
        // --------------------------------TRANSITIONS-----------------------------------------------
        // -------------------------------------------------------------------------------------------

        // -------------------------------------------------------------------------------------------------------------
        // -------------------------------Transitions for Intersection 1-----------------------------------------------------------------
        // -------------------------------------------------------------------------------------------------------------


        // Lane 1 ----------------------------------------------

        // T1 ------------------------------------------------
        PetriTransition t1 = new PetriTransition(pn);
        t1.TransitionName = "T1";
        t1.InputPlaceName.add("P1");
        t1.InputPlaceName.add("P2");

        Condition T1Ct1 = new Condition(t1, "P1", TransitionCondition.NotNull);
        Condition T1Ct2 = new Condition(t1, "P2", TransitionCondition.CanAddCars);
        T1Ct1.SetNextCondition(LogicConnector.AND, T1Ct2);

        Condition T1Ct1_2 = new Condition(t1, "P1", TransitionCondition.NotNull);
        Condition T1Ct2_2 = new Condition(t1, "P2", TransitionCondition.CanNotAddCars);
        T1Ct1_2.SetNextCondition(LogicConnector.AND, T1Ct2_2);

        GuardMapping grdT1 = new GuardMapping();
        grdT1.condition = T1Ct1;
        grdT1.Activations.add(new Activation(t1, "P1", TransitionOperation.AddElement, "P2"));
        t1.GuardMappingList.add(grdT1);

        GuardMapping grdT1_2 = new GuardMapping();
        grdT1_2.condition = T1Ct1_2;
        grdT1_2.Activations.add(new Activation(t1, "full", TransitionOperation.SendOverNetwork, "OP1"));
        grdT1_2.Activations.add(new Activation(t1, "P1", TransitionOperation.Move, "P1"));
        t1.GuardMappingList.add(grdT1_2);

        t1.Delay = 0;
        pn.Transitions.add(t1);

        // T2 ------------------------------------------------
        PetriTransition t2 = new PetriTransition(pn);
        t2.TransitionName = "T2";
        t2.InputPlaceName.add("P2");
        t2.InputPlaceName.add("TL1");

        Condition T2Ct1 = new Condition(t2, "TL1", TransitionCondition.Equal, "green");
        Condition T2Ct2 = new Condition(t2, "P2", TransitionCondition.HaveCar);
        T2Ct1.SetNextCondition(LogicConnector.AND, T2Ct2);

        GuardMapping grdT2 = new GuardMapping();
        grdT2.condition = T2Ct1;
        grdT2.Activations.add(new Activation(t2, "P2", TransitionOperation.PopElementWithoutTarget, "P3"));
        grdT2.Activations.add(new Activation(t2, "TL1", TransitionOperation.Move, "TL1"));

        t2.GuardMappingList.add(grdT2);

        t2.Delay = 0;
        pn.Transitions.add(t2);

        // T3 ------------------------------------------------
        PetriTransition t3 = new PetriTransition(pn);
        t3.TransitionName = "T3";
        t3.InputPlaceName.add("P3");
        t3.InputPlaceName.add("P0");

        Condition T3Ct1 = new Condition(t3, "P3", TransitionCondition.NotNull);
        Condition T3Ct2 = new Condition(t3, "P0", TransitionCondition.CanAddCars);
        T3Ct1.SetNextCondition(LogicConnector.AND, T3Ct2);

        GuardMapping grdT3 = new GuardMapping();
        grdT3.condition = T3Ct1;
        grdT3.Activations.add(new Activation(t3, "P3", TransitionOperation.AddElement, "P0"));
        t3.GuardMappingList.add(grdT3);

        t3.Delay = 0;
        pn.Transitions.add(t3);



        // Exit Lane 1 -------------------

        // T4 ----------------------------------
		PetriTransition t4 = new PetriTransition(pn);
		t4.TransitionName ="T4";
		t4.InputPlaceName.add("P0");
		t4.InputPlaceName.add("P4");

		Condition T4Ct1 = new Condition(t4, "P0", TransitionCondition.HaveCarForMe);
		Condition T4Ct2 = new Condition(t4, "P4", TransitionCondition.CanAddCars);
		T4Ct1.SetNextCondition(LogicConnector.AND,T4Ct2);

		GuardMapping grdT4 = new GuardMapping();
		grdT4.condition = T4Ct1;
		grdT4.Activations.add(new Activation(t4, "P0",TransitionOperation.PopElementWithTargetToQueue, "P4"));
		t4.GuardMappingList.add(grdT4);

		t4.Delay = 0;
		pn.Transitions.add(t4);

		// T30 ------------------------------------------------
		PetriTransition t30 = new PetriTransition(pn);
		t30.TransitionName ="T30";
		t30.InputPlaceName.add("P4");

		Condition T30Ct1 = new Condition(t30, "P4", TransitionCondition.HaveCar);

		GuardMapping grdT30 = new GuardMapping();
		grdT30.condition = T30Ct1;
		grdT30.Activations.add(new Activation(t30, "P4",TransitionOperation.PopElementWithoutTarget, "P29"));
		t30.GuardMappingList.add(grdT30);
		t30.Delay = 0;
		pn.Transitions.add(t30);

        // Lane 2
        // T5 ------------------------------------------------
        PetriTransition t5 = new PetriTransition(pn);
        t5.TransitionName = "T5";
        t5.InputPlaceName.add("P5");
        t5.InputPlaceName.add("P6");

        Condition T5Ct1 = new Condition(t5, "P5", TransitionCondition.NotNull);
        Condition T5Ct2 = new Condition(t5, "P6", TransitionCondition.CanAddCars);
        T5Ct1.SetNextCondition(LogicConnector.AND, T5Ct2);

        Condition T5Ct1_2 = new Condition(t5, "P5", TransitionCondition.NotNull);
        Condition T5Ct2_2 = new Condition(t5, "P6", TransitionCondition.CanNotAddCars);
        T5Ct1_2.SetNextCondition(LogicConnector.AND, T5Ct2_2);

        GuardMapping grdT5 = new GuardMapping();
        grdT5.condition = T5Ct1;
        grdT5.Activations.add(new Activation(t5, "P5", TransitionOperation.AddElement, "P6"));
        t5.GuardMappingList.add(grdT5);

        GuardMapping grdT5_2 = new GuardMapping();
        grdT5_2.condition = T5Ct1_2;
        grdT5_2.Activations.add(new Activation(t5, "full", TransitionOperation.SendOverNetwork, "OP2"));
        grdT5_2.Activations.add(new Activation(t5, "P5", TransitionOperation.Move, "P5"));
        t5.GuardMappingList.add(grdT5_2);

        t5.Delay = 0;
        pn.Transitions.add(t5);

        // T6 ------------------------------------------------
        PetriTransition t6 = new PetriTransition(pn);
        t6.TransitionName = "T6";
        t6.InputPlaceName.add("P6");
        t6.InputPlaceName.add("TL2");

        Condition T6Ct1 = new Condition(t6, "TL2", TransitionCondition.Equal, "green");
        Condition T6Ct2 = new Condition(t6, "P6", TransitionCondition.HaveCar);
        T6Ct1.SetNextCondition(LogicConnector.AND, T6Ct2);

        GuardMapping grdT6 = new GuardMapping();
        grdT6.condition = T6Ct1;
        grdT6.Activations.add(new Activation(t6, "P6", TransitionOperation.PopElementWithoutTarget, "P7"));
        grdT6.Activations.add(new Activation(t6, "TL2", TransitionOperation.Move, "TL2"));

        t6.GuardMappingList.add(grdT6);

        t6.Delay = 0;
        pn.Transitions.add(t6);

        // T7 ------------------------------------------------
        PetriTransition t7 = new PetriTransition(pn);
        t7.TransitionName = "T7";
        t7.InputPlaceName.add("P7");
        t7.InputPlaceName.add("P0");

        Condition T7Ct1 = new Condition(t7, "P7", TransitionCondition.NotNull);
        Condition T7Ct2 = new Condition(t7, "P0", TransitionCondition.CanAddCars);
        T7Ct1.SetNextCondition(LogicConnector.AND, T7Ct2);

        GuardMapping grdT7 = new GuardMapping();
        grdT7.condition = T7Ct1;
        grdT7.Activations.add(new Activation(t7, "P7", TransitionOperation.AddElement, "P0"));
        t7.GuardMappingList.add(grdT7);

        t7.Delay = 0;
        pn.Transitions.add(t7);

        // Exit Lane 2 -------------------
        // T8 ----------------------------------
        PetriTransition t8 = new PetriTransition(pn);
        t8.TransitionName = "T8";
        t8.InputPlaceName.add("P0");
        t8.InputPlaceName.add("P8");

        Condition T8Ct1 = new Condition(t8, "P0", TransitionCondition.HaveCarForMe);
        Condition T8Ct2 = new Condition(t8, "P8", TransitionCondition.CanAddCars);
        T8Ct1.SetNextCondition(LogicConnector.AND, T8Ct2);

        GuardMapping grdT8 = new GuardMapping();
        grdT8.condition = T8Ct1;
        grdT8.Activations.add(new Activation(t8, "P0", TransitionOperation.PopElementWithTargetToQueue, "P8"));
        t8.GuardMappingList.add(grdT8);

        t8.Delay = 0;
        pn.Transitions.add(t8);

        // T31 ------------------------------------------------
        PetriTransition t31 = new PetriTransition(pn);
        t31.TransitionName = "T31";
        t31.InputPlaceName.add("P8");

        Condition T31Ct1 = new Condition(t31, "P8", TransitionCondition.HaveCar);

        GuardMapping grdT31 = new GuardMapping();
        grdT31.condition = T31Ct1;
        grdT31.Activations.add(new Activation(t31, "P8", TransitionOperation.PopElementWithoutTarget, "P30"));
        t31.GuardMappingList.add(grdT31);
        t31.Delay = 0;
        pn.Transitions.add(t31);


        // Lane 3 ----------------------------------------------
        // T10 ------------------------------------------------
		PetriTransition t10 = new PetriTransition(pn);
		t10.TransitionName = "T10";
		t10.InputPlaceName.add("P10");
		t10.InputPlaceName.add("P11");

		Condition T10Ct1 = new Condition(t10, "P10", TransitionCondition.NotNull);
		Condition T10Ct2 = new Condition(t10, "P11", TransitionCondition.CanAddCars);
		T10Ct1.SetNextCondition(LogicConnector.AND, T10Ct2);

		Condition t10Ct1_2 = new Condition(t10, "P10", TransitionCondition.NotNull);
		Condition t10Ct2_2 = new Condition(t10, "P11", TransitionCondition.CanNotAddCars);
		t10Ct1_2.SetNextCondition(LogicConnector.AND,t10Ct2_2);

		GuardMapping grdT10 = new GuardMapping();
		grdT10.condition = T10Ct1;
		grdT10.Activations.add(new Activation(t10, "P10", TransitionOperation.AddElement, "P11"));
		t10.GuardMappingList.add(grdT10);

		GuardMapping grdT10_2 = new GuardMapping();
		grdT10_2.condition=t10Ct1_2;
		grdT10_2.Activations.add(new Activation(t10, "full",TransitionOperation.SendOverNetwork, "OP3"));
		grdT10_2.Activations.add(new Activation(t10, "P10",TransitionOperation.Move, "P10"));
		t10.GuardMappingList.add(grdT10_2);

		t10.Delay = 0;
		pn.Transitions.add(t10);

		// T11 ------------------------------------------------
		PetriTransition t11 = new PetriTransition(pn);
		t11.TransitionName = "T11";
		t11.InputPlaceName.add("P11");
		t11.InputPlaceName.add("TL3");

		Condition T11Ct1 = new Condition(t11, "TL3", TransitionCondition.Equal, "green");
		Condition T11Ct2 = new Condition(t11, "P11", TransitionCondition.HaveCar);
		T11Ct1.SetNextCondition(LogicConnector.AND, T11Ct2);

		GuardMapping grdT11 = new GuardMapping();
		grdT11.condition = T11Ct1;
		grdT11.Activations.add(new Activation(t11, "P11", TransitionOperation.PopElementWithoutTarget, "P12"));
	    grdT11.Activations.add(new Activation(t11, "TL3", TransitionOperation.Move, "TL3"));

		t11.GuardMappingList.add(grdT11);

		t11.Delay = 0;
		pn.Transitions.add(t11);

		// T12 ------------------------------------------------
		PetriTransition t12 = new PetriTransition(pn);
		t12.TransitionName = "T12";
		t12.InputPlaceName.add("P12");
		t12.InputPlaceName.add("P0");

		Condition T12Ct1 = new Condition(t12, "P12", TransitionCondition.NotNull);
		Condition T12Ct2 = new Condition(t12, "P0", TransitionCondition.CanAddCars);
		T12Ct1.SetNextCondition(LogicConnector.AND,T12Ct2);

		GuardMapping grdT12 = new GuardMapping();
		grdT12.condition =T12Ct1;
		grdT12.Activations.add(new Activation(t12, "P12",TransitionOperation.AddElement, "P0"));
		t12.GuardMappingList.add(grdT12);

		t12.Delay = 0;
		pn.Transitions.add(t12);


        //Exit Lane 3 -------------------
        // T9 ---------------------------------
        PetriTransition t9 = new PetriTransition(pn);
        t9.TransitionName = "T9";
        t9.InputPlaceName.add("P0");
        t9.InputPlaceName.add("P9");

        Condition T9Ct1 = new Condition(t9, "P0", TransitionCondition.HaveCarForMe);
        Condition T9Ct2 = new Condition(t9, "P9", TransitionCondition.CanAddCars);
        T9Ct1.SetNextCondition(LogicConnector.AND, T9Ct2);

        GuardMapping grdT9 = new GuardMapping();
        grdT9.condition = T9Ct1;
        grdT9.Activations.add(new Activation(t9, "P0", TransitionOperation.PopElementWithTargetToQueue, "P9"));
        t9.GuardMappingList.add(grdT9);

        t9.Delay = 0;
        pn.Transitions.add(t9);

        // T32 ------------------------------------------------
        PetriTransition t32 = new PetriTransition(pn);
        t32.TransitionName = "T32";
        t32.InputPlaceName.add("P9");

        Condition T32Ct1 = new Condition(t32, "P9", TransitionCondition.HaveCar);

        GuardMapping grdT32 = new GuardMapping();
        grdT32.condition = T32Ct1;
        grdT32.Activations.add(new Activation(t32, "P9", TransitionOperation.PopElementWithoutTarget, "P31"));
        t32.GuardMappingList.add(grdT32);
        t32.Delay = 0;
        pn.Transitions.add(t32);

        // Lane 4 ----------------------------------------------
        // T27 ------------------------------------------------
        PetriTransition t27 = new PetriTransition(pn);
        t27.TransitionName = "T27";
        t27.InputPlaceName.add("P15");
        t27.InputPlaceName.add("P27");

//        Condition T27Ct1 = new Condition(t27, "P15", TransitionCondition.HaveCar);
//        Condition T27Ct2 = new Condition(t27, "P27", TransitionCondition.CanAddCars);
//        T27Ct1.SetNextCondition(LogicConnector.AND, T27Ct2);
//
//        Condition T27Ct1_2 = new Condition(t27, "P15", TransitionCondition.NotNull);
//        Condition T27Ct2_2 = new Condition(t27, "P27", TransitionCondition.CanNotAddCars);
//        T27Ct1_2.SetNextCondition(LogicConnector.AND, T27Ct2_2);
//
//        GuardMapping grdT27 = new GuardMapping();
//        grdT27.condition = T27Ct1;
//        grdT27.Activations.add(new Activation(t27, "P15", TransitionOperation.PopElementWithTargetToQueue, "P27"));
//        t27.GuardMappingList.add(grdT27);
//
//        GuardMapping grdT27_2 = new GuardMapping();
//        grdT27_2.condition = T27Ct1_2;
//        grdT27_2.Activations.add(new Activation(t27, "full", TransitionOperation.SendOverNetwork, "OP8"));
//        grdT27_2.Activations.add(new Activation(t27, "P15", TransitionOperation.Move, "P15"));
//        t27.GuardMappingList.add(grdT27_2);

        t27.Delay = 0;
        pn.Transitions.add(t27);

        // T28 ------------------------------------------------
        PetriTransition t28 = new PetriTransition(pn);
        t28.TransitionName = "T28";
        t28.InputPlaceName.add("P27");
        t28.InputPlaceName.add("TL8");

        Condition T28Ct1 = new Condition(t28, "TL7", TransitionCondition.Equal, "green");
        Condition T28Ct2 = new Condition(t28, "P27", TransitionCondition.HaveCar);
        T28Ct1.SetNextCondition(LogicConnector.AND, T28Ct2);

        GuardMapping grdT28 = new GuardMapping();
        grdT28.condition = T28Ct1;
        grdT28.Activations.add(new Activation(t28, "P27", TransitionOperation.PopElementWithoutTarget, "P28"));
        grdT28.Activations.add(new Activation(t28, "TL8", TransitionOperation.Move, "TL8"));

        t28.GuardMappingList.add(grdT28);

        t28.Delay = 0;
        pn.Transitions.add(t28);

        // T29 ------------------------------------------------
        PetriTransition t29 = new PetriTransition(pn);
        t29.TransitionName = "T29";
        t29.InputPlaceName.add("P28");
        t29.InputPlaceName.add("P0");

        Condition T29Ct1 = new Condition(t29, "P28", TransitionCondition.NotNull);
        Condition T29Ct2 = new Condition(t29, "P0", TransitionCondition.CanAddCars);
        T29Ct1.SetNextCondition(LogicConnector.AND, T29Ct2);

        GuardMapping grdT29 = new GuardMapping();
        grdT29.condition = T29Ct1;
        grdT29.Activations.add(new Activation(t29, "P28", TransitionOperation.AddElement, "P0"));
        t29.GuardMappingList.add(grdT29);

        t29.Delay = 0;
        pn.Transitions.add(t29);



        //Exit Lane 4 -------------------
        //T13 ------------------------------------------------
        PetriTransition t13 = new PetriTransition(pn);
        t13.TransitionName = "T13";
        t13.InputPlaceName.add("P0");
        t13.InputPlaceName.add("P13");

        Condition T13Ct1 = new Condition(t13, "P0", TransitionCondition.HaveCar);
        Condition T13Ct2 = new Condition(t13, "P13", TransitionCondition.CanAddCars);
        T13Ct1.SetNextCondition(LogicConnector.AND, T13Ct2);

        Condition T13Ct1_2 = new Condition(t13, "P0", TransitionCondition.NotNull);
        Condition T13Ct2_2 = new Condition(t13, "P13", TransitionCondition.CanNotAddCars);
        T13Ct1_2.SetNextCondition(LogicConnector.AND, T13Ct2_2);

        GuardMapping grdT13 = new GuardMapping();
        grdT13.condition = T13Ct1;
        grdT13.Activations.add(new Activation(t13, "P0", TransitionOperation.PopElementWithTargetToQueue, "P13"));
        t13.GuardMappingList.add(grdT13);

        GuardMapping grdT13_2 = new GuardMapping();
        grdT13_2.condition = T13Ct1_2;
        grdT13_2.Activations.add(new Activation(t13, "full", TransitionOperation.SendOverNetwork, "OP7"));
        grdT13_2.Activations.add(new Activation(t13, "P0", TransitionOperation.Move, "P0"));
        t13.GuardMappingList.add(grdT13_2);

        t13.Delay = 0;
        pn.Transitions.add(t13);

        // T14 ------------------------------------------------
        PetriTransition t14 = new PetriTransition(pn);
        t14.TransitionName = "T14";
        t14.InputPlaceName.add("P13");
        t14.InputPlaceName.add("TL7");

        Condition T14Ct1 = new Condition(t14, "TL7", TransitionCondition.Equal, "green");
        Condition T14Ct2 = new Condition(t14, "P13", TransitionCondition.HaveCar);
        T14Ct1.SetNextCondition(LogicConnector.AND, T14Ct2);

        GuardMapping grdT14 = new GuardMapping();
        grdT14.condition = T14Ct1;
        grdT14.Activations.add(new Activation(t14, "P13", TransitionOperation.PopElementWithoutTarget, "P14"));
        grdT14.Activations.add(new Activation(t14, "TL7", TransitionOperation.Move, "TL7"));

        t14.GuardMappingList.add(grdT14);

        t14.Delay = 0;
        pn.Transitions.add(t14);

        // T15 ------------------------------------------------
        PetriTransition t15 = new PetriTransition(pn);
        t15.TransitionName = "T15";
        t15.InputPlaceName.add("P14");
        t15.InputPlaceName.add("P15");

        Condition T15Ct1 = new Condition(t15, "P14", TransitionCondition.NotNull);
        Condition T15Ct2 = new Condition(t15, "P15", TransitionCondition.CanAddCars);
        T15Ct1.SetNextCondition(LogicConnector.AND, T15Ct2);

        GuardMapping grdT15 = new GuardMapping();
        grdT15.condition = T15Ct1;
        grdT15.Activations.add(new Activation(t15, "P14", TransitionOperation.AddElement, "P15"));
        t15.GuardMappingList.add(grdT15);

        t15.Delay = 0;
        pn.Transitions.add(t15);


        // -------------------------------------------------------------------------------------------------------------
        // -------------------------------Transitions for Intersection 2-----------------------------------------------------------------
        // -------------------------------------------------------------------------------------------------------------
        
        // Lane 1 ----------------------------------------------
        // T16 ------------------------------------------------
        PetriTransition t16 = new PetriTransition(pn);
        t16.TransitionName = "T16";
        t16.InputPlaceName.add("P16");
        t16.InputPlaceName.add("P17");
 
        Condition T16Ct1 = new Condition(t16, "P16", TransitionCondition.NotNull);
        Condition T16Ct2 = new Condition(t16, "P17", TransitionCondition.CanAddCars);
        T16Ct1.SetNextCondition(LogicConnector.AND, T16Ct2);
  
        Condition T16Ct1_2 = new Condition(t16, "P16", TransitionCondition.NotNull);
        Condition T16Ct2_2 = new Condition(t16, "P17", TransitionCondition.CanNotAddCars);
        T16Ct1_2.SetNextCondition(LogicConnector.AND, T16Ct2_2);

        GuardMapping grdT16 = new GuardMapping();
        grdT16.condition = T16Ct1;
        grdT16.Activations.add(new Activation(t16, "P16", TransitionOperation.AddElement, "P17"));
        t16.GuardMappingList.add(grdT16);

        GuardMapping grdT16_2 = new GuardMapping();
        grdT16_2.condition = T16Ct1_2;
        grdT16_2.Activations.add(new Activation(t16, "full", TransitionOperation.SendOverNetwork, "OP4"));
        grdT16_2.Activations.add(new Activation(t16, "P16", TransitionOperation.Move, "P16"));
        t16.GuardMappingList.add(grdT16_2);

        t16.Delay = 0;
        pn.Transitions.add(t16);

        // T17 ------------------------------------------------
        PetriTransition t17 = new PetriTransition(pn);
        t17.TransitionName = "T17";
        t17.InputPlaceName.add("P17");
        t17.InputPlaceName.add("TL4");

        Condition T17Ct1 = new Condition(t17, "TL4", TransitionCondition.Equal, "green");
        Condition T17Ct2 = new Condition(t17, "P17", TransitionCondition.HaveCar);
        T17Ct1.SetNextCondition(LogicConnector.AND, T17Ct2);

        GuardMapping grdT17 = new GuardMapping();
        grdT17.condition = T17Ct1;
        grdT17.Activations.add(new Activation(t17, "P17", TransitionOperation.PopElementWithoutTarget, "P18"));
        grdT17.Activations.add(new Activation(t17, "TL4", TransitionOperation.Move, "TL4"));

        t17.GuardMappingList.add(grdT17);

        t17.Delay = 0;
        pn.Transitions.add(t17);

        // T18 ------------------------------------------------
        PetriTransition t18 = new PetriTransition(pn);
        t18.TransitionName = "T18";
        t18.InputPlaceName.add("P18");
        t18.InputPlaceName.add("P15");

        Condition T18Ct1 = new Condition(t18, "P18", TransitionCondition.NotNull);
        Condition T18Ct2 = new Condition(t18, "P15", TransitionCondition.CanAddCars);
        T18Ct1.SetNextCondition(LogicConnector.AND, T18Ct2);

        GuardMapping grdT18 = new GuardMapping();
        grdT18.condition = T18Ct1;
        grdT18.Activations.add(new Activation(t18, "P18", TransitionOperation.AddElement, "P15"));
        t18.GuardMappingList.add(grdT18);

        t18.Delay = 0;
        pn.Transitions.add(t18);

        // Lane 2 ----------------------------------------------
        // T19 ------------------------------------------------
        PetriTransition t19 = new PetriTransition(pn);
        t19.TransitionName = "T19";
        t19.InputPlaceName.add("P19");
        t19.InputPlaceName.add("P20");

        Condition T19Ct1 = new Condition(t19, "P19", TransitionCondition.NotNull);
        Condition T19Ct2 = new Condition(t19, "P20", TransitionCondition.CanAddCars);
        T19Ct1.SetNextCondition(LogicConnector.AND, T19Ct2);

        Condition T19Ct1_2 = new Condition(t19, "P19", TransitionCondition.NotNull);
        Condition T19Ct2_2 = new Condition(t19, "P20", TransitionCondition.CanNotAddCars);
        T19Ct1_2.SetNextCondition(LogicConnector.AND, T19Ct2_2);

        GuardMapping grdT19 = new GuardMapping();
        grdT19.condition = T19Ct1;
        grdT19.Activations.add(new Activation(t19, "P19", TransitionOperation.AddElement, "P20"));
        t19.GuardMappingList.add(grdT19);

        GuardMapping grdT19_2 = new GuardMapping();
        grdT19_2.condition = T19Ct1_2;
        grdT19_2.Activations.add(new Activation(t19, "full", TransitionOperation.SendOverNetwork, "OP5"));
        grdT19_2.Activations.add(new Activation(t19, "P19", TransitionOperation.Move, "P19"));
        t19.GuardMappingList.add(grdT19_2);

        t19.Delay = 0;
        pn.Transitions.add(t19);

        // T20 ------------------------------------------------
        PetriTransition t20 = new PetriTransition(pn);
        t20.TransitionName = "T20";
        t20.InputPlaceName.add("P20");
        t20.InputPlaceName.add("TL5");

        Condition T20Ct1 = new Condition(t20, "TL5", TransitionCondition.Equal, "green");
        Condition T20Ct2 = new Condition(t20, "P20", TransitionCondition.HaveCar);
        T20Ct1.SetNextCondition(LogicConnector.AND, T20Ct2);

        GuardMapping grdT20 = new GuardMapping();
        grdT20.condition = T20Ct1;
        grdT20.Activations.add(new Activation(t20, "P20", TransitionOperation.PopElementWithoutTarget, "P21"));
        grdT20.Activations.add(new Activation(t20, "TL5", TransitionOperation.Move, "TL5"));

        t20.GuardMappingList.add(grdT20);

        t20.Delay = 0;
        pn.Transitions.add(t20);

        // T21 ------------------------------------------------
        PetriTransition t21 = new PetriTransition(pn);
        t21.TransitionName = "T21";
        t21.InputPlaceName.add("P21");
        t21.InputPlaceName.add("P15");

        Condition T21Ct1 = new Condition(t21, "P21", TransitionCondition.NotNull);
        Condition T21Ct2 = new Condition(t21, "P15", TransitionCondition.CanAddCars);
        T21Ct1.SetNextCondition(LogicConnector.AND, T21Ct2);

        GuardMapping grdT21 = new GuardMapping();
        grdT21.condition = T21Ct1;
        grdT21.Activations.add(new Activation(t21, "P21", TransitionOperation.AddElement, "P15"));
        t21.GuardMappingList.add(grdT21);

        t21.Delay = 0;
        pn.Transitions.add(t21);


        // Exit Lane 2 -------------------
        // T22 ----------------------------------
        PetriTransition t22 = new PetriTransition(pn);
        t22.TransitionName ="T22";
        t22.InputPlaceName.add("P15");
        t22.InputPlaceName.add("P22");

        Condition T22Ct1 = new Condition(t22, "P15", TransitionCondition.HaveCarForMe);
        Condition T22Ct2 = new Condition(t22, "P22", TransitionCondition.CanAddCars);
        T22Ct1.SetNextCondition(LogicConnector.AND,T22Ct2);

        GuardMapping grdT22 = new GuardMapping();
        grdT22.condition = T22Ct1;
        grdT22.Activations.add(new Activation(t22, "P15",TransitionOperation.PopElementWithTargetToQueue, "P22"));
        t22.GuardMappingList.add(grdT22);

        t22.Delay = 0;
        pn.Transitions.add(t22);

        // T33 ------------------------------------------------
        PetriTransition t33 = new PetriTransition(pn);
        t33.TransitionName ="T33";
        t33.InputPlaceName.add("P22");

        Condition T33Ct1 = new Condition(t33, "P22", TransitionCondition.HaveCar);

        GuardMapping grdT33 = new GuardMapping();
        grdT33.condition = T33Ct1;
        grdT33.Activations.add(new Activation(t33, "P22",TransitionOperation.PopElementWithoutTarget, "P32"));
        t33.GuardMappingList.add(grdT33);
        t33.Delay = 0;
        pn.Transitions.add(t33);


        // Lane 3 ----------------------------------------------
        // T23 ------------------------------------------------
        PetriTransition t23 = new PetriTransition(pn);
        t23.TransitionName = "T23";
        t23.InputPlaceName.add("P23");
        t23.InputPlaceName.add("P24");

        Condition T23Ct1 = new Condition(t23, "P23", TransitionCondition.NotNull);
        Condition T23Ct2 = new Condition(t23, "P24", TransitionCondition.CanAddCars);
        T23Ct1.SetNextCondition(LogicConnector.AND, T23Ct2);

        Condition T23Ct1_2 = new Condition(t23, "P23", TransitionCondition.NotNull);
        Condition T23Ct2_2 = new Condition(t23, "P24", TransitionCondition.CanNotAddCars);
        T23Ct1_2.SetNextCondition(LogicConnector.AND, T23Ct2_2);

        GuardMapping grdT23 = new GuardMapping();
        grdT23.condition = T23Ct1;
        grdT23.Activations.add(new Activation(t23, "P23", TransitionOperation.AddElement, "P24"));
        t23.GuardMappingList.add(grdT23);

        GuardMapping grdT23_2 = new GuardMapping();
        grdT23_2.condition = T23Ct1_2;
        grdT23_2.Activations.add(new Activation(t23, "full", TransitionOperation.SendOverNetwork, "OP6"));
        grdT23_2.Activations.add(new Activation(t23, "P23", TransitionOperation.Move, "P23"));
        t23.GuardMappingList.add(grdT23_2);

        t23.Delay = 0;
        pn.Transitions.add(t23);

        // T24 ------------------------------------------------
        PetriTransition t24 = new PetriTransition(pn);
        t24.TransitionName = "T24";
        t24.InputPlaceName.add("P24");
        t24.InputPlaceName.add("TL6");

        Condition T24Ct1 = new Condition(t24, "TL6", TransitionCondition.Equal, "green");
        Condition T24Ct2 = new Condition(t24, "P24", TransitionCondition.HaveCar);
        T24Ct1.SetNextCondition(LogicConnector.AND, T24Ct2);

        GuardMapping grdT24 = new GuardMapping();
        grdT24.condition = T24Ct1;
        grdT24.Activations.add(new Activation(t24, "P24", TransitionOperation.PopElementWithoutTarget, "P25"));
        grdT24.Activations.add(new Activation(t24, "TL6", TransitionOperation.Move, "TL6"));

        t24.GuardMappingList.add(grdT24);

        t24.Delay = 0;
        pn.Transitions.add(t24);

        // T25 ------------------------------------------------
        PetriTransition t25 = new PetriTransition(pn);
        t25.TransitionName = "T25";
        t25.InputPlaceName.add("P25");
        t25.InputPlaceName.add("P15");

        Condition T25Ct1 = new Condition(t25, "P25", TransitionCondition.NotNull);
        Condition T25Ct2 = new Condition(t25, "P15", TransitionCondition.CanAddCars);
        T25Ct1.SetNextCondition(LogicConnector.AND, T25Ct2);

        GuardMapping grdT25 = new GuardMapping();
        grdT25.condition = T25Ct1;
        grdT25.Activations.add(new Activation(t25, "P25", TransitionOperation.AddElement, "P15"));
        t25.GuardMappingList.add(grdT25);

        t25.Delay = 0;
        pn.Transitions.add(t25);


        // Exit Lane 3 -------------------
        // T26 ----------------------------------
        PetriTransition t26 = new PetriTransition(pn);
        t26.TransitionName ="T26";
        t26.InputPlaceName.add("P15");
        t26.InputPlaceName.add("P26");

        Condition T26Ct1 = new Condition(t26, "P15", TransitionCondition.HaveCarForMe);
        Condition T26Ct2 = new Condition(t26, "P26", TransitionCondition.CanAddCars);
        T26Ct1.SetNextCondition(LogicConnector.AND,T26Ct2);

        GuardMapping grdT26 = new GuardMapping();
        grdT26.condition = T26Ct1;
        grdT26.Activations.add(new Activation(t26, "P15",TransitionOperation.PopElementWithTargetToQueue, "P26"));
        t26.GuardMappingList.add(grdT26);

        t26.Delay = 0;
        pn.Transitions.add(t26);

        // T34 ------------------------------------------------
        PetriTransition t34 = new PetriTransition(pn);
        t34.TransitionName ="T34";
        t34.InputPlaceName.add("P26");

        Condition T34Ct1 = new Condition(t34, "P26", TransitionCondition.HaveCar);

        GuardMapping grdT34 = new GuardMapping();
        grdT34.condition = T34Ct1;
        grdT34.Activations.add(new Activation(t34, "P26",TransitionOperation.PopElementWithoutTarget, "P33"));
        t34.GuardMappingList.add(grdT34);
        t34.Delay = 0;
        pn.Transitions.add(t34);

        // -------------------------------------------------------------------------------------
        // ----------------------------PNStart-------------------------------------------------
        // -------------------------------------------------------------------------------------

        System.out.println("Exp1 started \n ------------------------------");
        pn.Delay = 2000;
        // pn.Start();

        PetriNetWindow frame = new PetriNetWindow(false);
        frame.petriNet = pn;
        frame.setVisible(true);
    }

}

