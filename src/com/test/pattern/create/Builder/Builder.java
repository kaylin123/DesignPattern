package com.test.pattern.create.Builder;

import java.util.ArrayList;
import java.util.List;
import com.test.pattern.base.*;

public class Builder {
	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
	
	public List getList() {
		return list;
	}
	
}
