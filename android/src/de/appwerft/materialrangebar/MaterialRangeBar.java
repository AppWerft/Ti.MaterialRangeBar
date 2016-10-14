package de.appwerft.materialrangebar;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiCompositeLayout;
import org.appcelerator.titanium.view.TiCompositeLayout.LayoutArrangement;
import org.appcelerator.titanium.view.TiUIView;

import com.appyvet.rangebar.RangeBar;

public class MaterialRangeBar extends TiUIView {
	RangeBar view;

	public MaterialRangeBar(TiViewProxy proxy) {
		super(proxy);
		view = new RangeBar(proxy.getActivity());
		setNativeView(view);
	}

	@Override
	public void processProperties(KrollDict d) {
		super.processProperties(d);
	}
}
