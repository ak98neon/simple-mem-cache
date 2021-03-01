package com.hcp.memcache.cache;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class InMemoryCacheWithDelayQueueTest {

	@Test
	void add() {
		Cache cache = new InMemoryCacheWithDelayQueue();

		Object orig = new Object();
		final String key = "object";

		cache.add(key, orig, 10_000_000);
		final Object obj = cache.get(key);

		assertThat(obj).isEqualTo(orig);
	}
}
