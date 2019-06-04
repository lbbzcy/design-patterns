package com.lbbzcy.design.patterns.chainofresponsibility;

/**
 * @Description:
 * @Author: zhucy
 * @Date: 2019-06-03 14:48
 * @Copyright: asiainfo
 */
public abstract class Support {
	private String name;
	private Support next;

	public Support(String name) {
		this.name = name;
	}

	public Support setNext(Support next) {
		this.next = next;
		return next;
	}

	public final void support(Trouble trouble) {
		if (resolve(trouble)) {
			done(trouble);
		} else if (next != null) {
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}

	public String toString() {
		return "[" + name + "]";
	}

	protected abstract boolean resolve(Trouble trouble);

	protected void done(Trouble trouble) {
		System.out.println(trouble + "is resoled by " + this + ".");
	}

	protected void fail(Trouble trouble) {
		System.out.println(trouble + "cannot be resolved.");
	}
}
