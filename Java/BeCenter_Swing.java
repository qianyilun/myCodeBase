// https://www.youtube.com/watch?v=5vSyylPPEko
// https://stackoverflow.com/questions/2442599/how-to-set-jframe-to-appear-centered-regardless-of-monitor-resolution

Swing窗口居中

/*
* ---> Set the JFrame as center of a screen
*
* Please note: 	if pack() method is used, setLocationRelativeTo should be used after pack() method call 
*
* @Allen Qian
 */

public void beCenter() {
    frame.pack();
    // ***************************************************************************************
    // Please note: if pack() method is used, setLocationRelativeTo should be used after pack() method call
    // ****************************************************************************************
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}

