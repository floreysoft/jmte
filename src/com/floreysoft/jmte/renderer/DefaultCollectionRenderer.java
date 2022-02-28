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
			renderedResult = String.valueOf(collection.iterator().next());
		} else {
			renderedResult = collection.toString();
		}
		return renderedResult;

	}

}
