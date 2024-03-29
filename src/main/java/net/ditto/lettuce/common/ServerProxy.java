package net.ditto.lettuce.common;

import net.minecraft.util.text.translation.I18n;

public class ServerProxy implements IProxy {

	@Override
	public String localize(String text) {
		return I18n.translateToLocal(text);
	}

	@Override
	public String format(String text, Object... args) {
		return I18n.translateToLocalFormatted(text, args);
	}

}
