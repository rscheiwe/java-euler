package com.javaonyx;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Main {

    public static void main(String[] args) {

        ThreeFive numTest = new ThreeFive(2000);
        int a = numTest.runThreeFive();
        String str1 = Integer.toString(a);
        
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText(str1);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
//        System.out.println(a);
    }
}
