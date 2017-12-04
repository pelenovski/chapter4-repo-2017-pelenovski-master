package Assignments;



/**
Pane Elenovski
12/4/2017
Circuit Lab
Tests a lap by turning two switches on and off
 */
public class Circuit
{
    private boolean lamp, switch1, switch2;

    public int getLampState()
    {
        if (switch1 == true)
        
    }

    public boolean getFirstSwitchState()
    {
        return switch1;
    }
    
    public boolean getSecondSwitchState()
    {
        return switch2;
    }
    
    public void toggleFirstSwitch()
    {
        if (switch1 == true)
            switch1 = false;
        else if (switch1 == false)
            switch1 = true;
    }
    
    public void toggleSecondSwitch()
    {
        if (switch2 == true)
            switch2 = false;
        else if (switch2 == false)
            switch2 = true;
    }
    public string toString()
    {
        String result;
        
        result += "Lamp state: " + lamp + "\n";
        result += "Switch 1 State: " + switch1 + "\n";
        result += "Switch 2 State: " + switch2 + "\n";
        return result;
    }
}
