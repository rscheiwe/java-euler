package com.javaonyx;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Main {

    public static void main(String[] args) {

        ThreeFive numTest = new ThreeFive(2000);
        int a = numTest.runThreeFive();
        String str1 = Integer.toString(a);
        
		Display display = new Display();
		Shell shell = new Shell(display);
		Text threeFiveResult = new Text(shell, SWT.CENTER);
	    threeFiveResult.setText(str1);
	    threeFiveResult.setBounds(47, 20, 100, 20);
		shell.setText(str1);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
//        System.out.println(a);
    }
}
