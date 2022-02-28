package com.floreysoft.jmte.renderer;

import java.util.Collection;
import java.util.Locale;
import java.util.Map;

import com.floreysoft.jmte.Renderer;

@SuppressWarnings("rawtypes")
public class DefaultCollectionRenderer implements Renderer<Collection> {

	@Override
	public String render(Collection collection, Locale locale, Map<String, Object> model) {
		final String renderedResult;

		if (collection.size() == 0) {
			renderedResult = "";
		} else if (collection.size() == 1) {
			Object o = collection.iterator().next();
			if ( o != null ) {
				renderedResult = String.valueOf(o);
			} else {
				renderedResult = "";
			}
		} else {
			renderedResult = String.valueOf(collection);
		}
		return renderedResult;

	}

}
