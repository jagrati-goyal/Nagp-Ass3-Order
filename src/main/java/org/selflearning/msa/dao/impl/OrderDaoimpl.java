package org.selflearning.msa.dao.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.sql.Date;

import org.selflearning.msa.dao.OrderDao;
import org.selflearning.msa.dto.OrderDTO;
import org.selflearning.msa.dto.ResultDTO;
import org.selflearning.msa.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderDaoimpl implements OrderDao{
	
	static Map<String, List<Order>> orders = new HashMap<String, List<Order>>();
	
	static {
		List<Order> order1List = new ArrayList<>();
		order1List.add(new Order("1", "1", new Integer(250), Calendar.getInstance().getTime()));
		order1List.add(new Order("2", "1", new Integer(450), Calendar.getInstance().getTime()));
		orders.put("1", order1List);
		List<Order> order2List = new ArrayList<>();
		order2List.add(new Order("10", "2", new Integer(150), Calendar.getInstance().getTime()));
		order2List.add(new Order("20", "2", new Integer(350), Calendar.getInstance().getTime()));
		orders.put("2", order2List);
	}

	public List<OrderDTO> getOrderByUserid(String userId) {
		List<Order> result = null;
		List<OrderDTO> orderDtoList = new ArrayList<>();
		ResultDTO resultDto = null;
		if (orders.containsKey(userId)) {
			result = orders.get(userId);
			resultDto = new ResultDTO();
			for (Order order : result) {
				OrderDTO dto = new OrderDTO();
				dto.setOrderId(order.getOrderId());
				dto.setOrderAmount(order.getOrderAmount());
				dto.setOrderDate(order.getDate());
				orderDtoList.add(dto);
			}
			resultDto.setOrders(orderDtoList);
		}
		return orderDtoList;
	}
}
