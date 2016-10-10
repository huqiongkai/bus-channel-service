/**
 * 
 */
package com.shbus.easybus.backoffice.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.shbus.easybus.backoffice.web.OrderQueryParamVO;
import com.shbus.easybus.data.dao.TExBusOrderMapper;
import com.shbus.easybus.data.model.TExBusOrder;
import com.shbus.easybus.data.model.TExBusOrderExample;

/**
 * @author Administrator
 *
 */
public class DbManagerImpl implements IDbManager {
	private TExBusOrderMapper exBusOrderDao;

	public void setExBusOrderDao(TExBusOrderMapper exBusOrderDao) {
		this.exBusOrderDao = exBusOrderDao;
	}

	@Override
	public List<TExBusOrder> pageSelectExBusOrders(OrderQueryParamVO orderQueryParamVO) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		if (StringUtils.isNotBlank(orderQueryParamVO.getExOrderId())) {
			paramMap.put(Constants.P_EX_ORDER_ID, orderQueryParamVO.getExOrderId().trim());
		}
		if (orderQueryParamVO.getChannelId() > 0) {
			paramMap.put(Constants.P_CHANNEL_ID, orderQueryParamVO.getChannelId());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getTicketStatus())) {
			paramMap.put(Constants.P_TICKET_STATUS, orderQueryParamVO.getTicketStatus().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getTicketRecStatus())) {
			paramMap.put(Constants.P_TICKET_REC_STATUS, orderQueryParamVO.getTicketRecStatus().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getPsgName())) {
			paramMap.put(Constants.P_PSG_NAME, orderQueryParamVO.getPsgName().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getPsgMobile())) {
			paramMap.put(Constants.P_PSG_MOBILE, orderQueryParamVO.getPsgMobile().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getPsgCertificateNo())) {
			paramMap.put(Constants.P_PSG_CERTIFICATE_NO, orderQueryParamVO.getPsgCertificateNo().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getFromStationId())) {
			paramMap.put(Constants.P_FROM_STATION_ID, orderQueryParamVO.getFromStationId().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getToStationName())) {
			paramMap.put(Constants.P_TO_STATION_NAME, orderQueryParamVO.getToStationName().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getIsTestOrder())) {
			paramMap.put(Constants.P_IS_TEST_ORDER, orderQueryParamVO.getIsTestOrder().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getCreateDateBegin())) {
			paramMap.put(Constants.P_CREATE_DATE_BEGIN, orderQueryParamVO.getCreateDateBegin().trim() + " 00:00:00");
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getCreateDateEnd())) {
			paramMap.put(Constants.P_CREATE_DATE_END, orderQueryParamVO.getCreateDateEnd().trim() + " 23:59:59");
		}
		if (orderQueryParamVO.getRowNumBegin() > 0) {
			paramMap.put(Constants.P_ROWNUM_BEGIN, orderQueryParamVO.getRowNumBegin());
		}
		if (orderQueryParamVO.getRowNumEnd() > 0) {
			paramMap.put(Constants.P_ROWNUM_END, orderQueryParamVO.getRowNumEnd());
		}
		return exBusOrderDao.selectOrderListByPage(paramMap);
	}
	
	@Override
	public List<TExBusOrder> searchExBusOrders(OrderQueryParamVO orderQueryParamVO) {
		TExBusOrderExample example = new TExBusOrderExample();
		com.shbus.easybus.data.model.TExBusOrderExample.Criteria crit = example.createCriteria();
		if (StringUtils.isNotBlank(orderQueryParamVO.getExOrderId())) {
			crit.andExOrderIdEqualTo(orderQueryParamVO.getExOrderId().trim());
		}
		if (orderQueryParamVO.getChannelId() > 0) {
			crit.andChannelIdEqualTo(orderQueryParamVO.getChannelId());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getTicketStatus())) {
			crit.andTicketStatusEqualTo(orderQueryParamVO.getTicketStatus().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getTicketRecStatus())) {
			crit.andTicketRecStatusEqualTo(orderQueryParamVO.getTicketRecStatus().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getPsgName())) {
			crit.andPsgNameLike(orderQueryParamVO.getPsgName().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getPsgMobile())) {
			crit.andPsgMobileEqualTo(orderQueryParamVO.getPsgMobile().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getPsgCertificateNo())) {
			crit.andPsgCertificateNoEqualTo(orderQueryParamVO.getPsgCertificateNo().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getFromStationId())) {
			crit.andUnitIdEqualTo(orderQueryParamVO.getFromStationId().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getToStationName())) {
			crit.andToStationNameLike(orderQueryParamVO.getToStationName().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getIsTestOrder())) {
			crit.andIsTestOrderEqualTo(orderQueryParamVO.getIsTestOrder().trim());
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getCreateDateBegin())) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			try {
				crit.andCreateDateGreaterThanOrEqualTo(
						sdf.parse(orderQueryParamVO.getCreateDateBegin().trim() + " 00:00:00"));
				if (StringUtils.isNotBlank(orderQueryParamVO.getCreateDateEnd())) {
					crit.andCreateDateLessThanOrEqualTo(
							sdf.parse(orderQueryParamVO.getCreateDateEnd().trim() + " 23:59:59"));
				}
			} catch (ParseException e) {
				// ignore the error
			}
		}
		/*if (StringUtils.isNotBlank(orderQueryParamVO.getRowNumBegin())) {
			try {
				crit.andORCLRowNumBetween(Long.parseLong(orderQueryParamVO.getRowNumBegin()),
						Long.parseLong(orderQueryParamVO.getRowNumEnd()));
			} catch (NumberFormatException e) {
				// ignore the error
			}
		}
		if (StringUtils.isNotBlank(orderQueryParamVO.getRowNumEnd())) {
			try {
				crit.andORCLRowNumLessThanOrEqualTo(Long.parseLong(orderQueryParamVO.getRowNumEnd()));
			} catch (NumberFormatException e) {
				// ignore the error
			}
		}*/
		example.setOrderByClause(" id desc ");
		
		return exBusOrderDao.selectByExample(example);
	}

	@Override
	public List<TExBusOrder> searchDailyExBusOrders(String dailyDateyyyyMMdd) {
		if (StringUtils.isBlank(dailyDateyyyyMMdd)) {
			dailyDateyyyyMMdd = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
		}
		return exBusOrderDao.selectDailyOrderList(dailyDateyyyyMMdd);
	}
	
	
}
