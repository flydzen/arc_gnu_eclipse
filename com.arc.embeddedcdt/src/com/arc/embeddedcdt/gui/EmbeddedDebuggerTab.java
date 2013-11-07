package com.arc.embeddedcdt.gui;

import org.eclipse.cdt.debug.core.ICDebugConfiguration;
import org.eclipse.cdt.launch.ui.CDebuggerTab;


public class EmbeddedDebuggerTab extends CDebuggerTab {

	public EmbeddedDebuggerTab(boolean attachMode) {
		super(attachMode);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.cdt.launch.internal.ui.AbstractCDebuggerTab#loadDebuggerCombo(org.eclipse.cdt.debug.core.ICDebugConfiguration[], java.lang.String)
	 */
	protected void loadDebuggerCombo(ICDebugConfiguration[] debugConfigs,
			String current) {
		/* Force the only choice */
		super.loadDebuggerCombo(debugConfigs, "com.arc.embeddedcdt.EmbeddedCDebugger");
	}

	public String getDebugger()
	{
		return ((EmbeddedGDBDebuggerPage)getDynamicTab()).getDebugger();
	}
}
