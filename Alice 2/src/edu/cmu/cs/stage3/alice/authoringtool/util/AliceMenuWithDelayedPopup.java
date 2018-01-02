/*
 * Copyright (c) 1999-2003, Carnegie Mellon University. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 
 * 3. Products derived from the software may not be called "Alice",
 *    nor may "Alice" appear in their name, without prior written
 *    permission of Carnegie Mellon University.
 * 
 * 4. All advertising materials mentioning features or use of this software
 *    must display the following acknowledgement:
 *    "This product includes software developed by Carnegie Mellon University"
 */

package edu.cmu.cs.stage3.alice.authoringtool.util;

/**
 * @author Jason Pratt
 */
public class AliceMenuWithDelayedPopup extends AliceMenu {
	protected java.util.Vector structure;
	protected boolean menuHasBeenPopulated = false;

	public AliceMenuWithDelayedPopup( String title, java.util.Vector structure ) {
		super( title );
		this.structure = structure;
	}

	public javax.swing.JPopupMenu getPopupMenu() {
		if( ! menuHasBeenPopulated ) {
			PopupMenuUtilities.populateDelayedMenu( this, structure );
			menuHasBeenPopulated = true;
		}
		return super.getPopupMenu();
	}
}