package io.pattern.observer;

public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}