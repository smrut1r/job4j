package com.talentica.job4j.api;

public interface XInputProducer<I> extends InputProducer<I>, Runnable{
	public boolean isFinished();
	public void setFinished(boolean isFinished);
	public void setJob(Job job);
}
