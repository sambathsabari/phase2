package com.carpenter.booking.service;

import java.util.List;


import com.carpenter.booking.model.Feedback;


public interface FeedbackService {


	public List<Feedback>getallFeedback();
	public Feedback addFeedback(Feedback feedback);
}

