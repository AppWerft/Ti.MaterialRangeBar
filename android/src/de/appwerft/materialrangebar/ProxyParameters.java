package de.appwerft.materialrangebar;

import java.lang.reflect.Field;
import java.util.HashMap;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.titanium.TiDimension;
import org.appcelerator.titanium.util.TiConvert;

import android.graphics.Color;

@SuppressWarnings("unused")
public class ProxyParameters extends HashMap {
	private TiDimension tickHeight;
	private TiDimension tickWidth;
	private Color barColor;
	private Color textColor;
	private Color pinColor;
	private Color selectorColor;
	private TiDimension selectorSize;
	private String title;
	private int test;

	public ProxyParameters(KrollDict options) {
		for (Field field : this.getClass().getFields()) {
			String name = field.getName();
			String type = field.getType().getSimpleName();
			if (type.equals("TiDimension")) {
				if (options.containsKeyAndNotNull(name)) {
					try {
						field.set(this, TiConvert.toTiDimension(
								options.get(name), TiDimension.TYPE_UNDEFINED));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}

				}
			} else if (type.equals("Color")) {
				if (options.containsKeyAndNotNull(name)) {
					try {
						field.set(this,
								Color.parseColor(options.getString(name)));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}

				}
			} else if (type.equals("String")) {
				if (options.containsKeyAndNotNull(name)) {
					try {
						field.set(this, options.getString(name));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}

				}
			} else if (type.equals("Double")) {
				if (options.containsKeyAndNotNull(name)) {
					try {
						field.set(this, options.getDouble(name));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}

				}
			} else if (type.equals("Integer")) {
				if (options.containsKeyAndNotNull(name)) {
					try {
						field.set(this, options.getInt(name));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}

				}
			} else if (type.equals("KrollDict")) {
				if (options.containsKeyAndNotNull(name)) {
					try {
						field.set(this, options.getKrollDict(name));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}

				}
			}
		}
	}

}
