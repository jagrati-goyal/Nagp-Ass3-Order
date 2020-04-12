package org.selflearning.msa.controller;

import java.util.List;

import org.selflearning.msa.dto.OrderDTO;
import org.selflearning.msa.dto.ResultDTO;
import org.selflearning.msa.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
	
	private static Logger LOG = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	private OrderService orderService;
	
	@GetMapping(value = "/orders/{userId}")
	@ResponseBody
	public ResultDTO getOrderByUserId(@PathVariable String userId) {
		LOG.info("Inside order service");
		List<OrderDTO> result = orderService.getOrderbyUserId(userId);
		ResultDTO dto = new ResultDTO();
		if (null != result) {
			dto.setOrders(result);
			LOG.info("Order with user id {} is present ",userId);
			LOG.info("Result {} ", result);
		} else {
			LOG.info("Order with user id " + userId + " not found");
		}
		return dto;
	}
}
