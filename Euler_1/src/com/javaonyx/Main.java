package com.javaonyx;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/* 
 * Simple attempt at multi-file workflow
 */

public class Main {

    public static void main(String[] args) {

//    	Create instance of ThreeFive
        ThreeFive numTest = new ThreeFive(2000);
//      Call runThreeFive() on instance
        int a = numTest.runThreeFive();
//      Convert to String for display
        String str1 = Integer.toString(a);
//      Call display and set to shell
		Display display = new Display();
		Shell shell = new Shell(display);
//		Set ThreeFive return sum to text
		Text threeFiveResult = new Text(shell, SWT.CENTER);
		threeFiveResult.setText(str1);
//		Style
		threeFiveResult.setBounds(47, 20, 100, 20);
//		Set result as the header, too
		shell.setText(str1);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
    }
}
