package com.carpenter.booking.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpenter.booking.model.Feedback;
import com.carpenter.booking.repository.FeedbackRepository;
import com.carpenter.booking.service.FeedbackService;

@Service
public class FeedbackImp implements FeedbackService{

	@Autowired
	private FeedbackRepository feedbackrepo;
	
	
	@Override
	public List<Feedback> getallFeedback() {
		
		return feedbackrepo.findAll();
	}

	@Override
	public Feedback addFeedback(Feedback feedback) {
		
		return feedbackrepo.save(feedback);
	}

}
