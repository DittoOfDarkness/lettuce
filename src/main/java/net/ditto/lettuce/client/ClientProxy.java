package net.ditto.lettuce.client;

import net.ditto.lettuce.common.IProxy;
import net.minecraft.client.resources.I18n;

public class ClientProxy implements IProxy {

	@Override
	public String localize(String text) {
		return I18n.format(text);
	}

	@Override
	public String format(String text, Object... args) {
		return I18n.format(text, args);
	}

}
