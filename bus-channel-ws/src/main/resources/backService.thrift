namespace java com.shbus.easybus.thrift.back
namespace csharp com.shbus.easybus.thrift.back 
namespace php com.shbus.easybus.thrift.back 
/**
 *出票成功
 */
const string TICKET_STATUS_SUC = "SUC" 
/**
 *出票失败
 */
const string TICKET_STATUS_FAIL = "FAIL" 
/**
 *已取票
 */
const string TICKET_REC_STATUS_YES= "YES"
/**
 *未取票
 */
const string TICKET_REC_STATUS_NO= "NO" 
/**
 *身份验证vo
 */
struct AuthVO{
/**
 *用户key
 */
1: required string key;
/**
 *用户签名  签名格式:md5(key+password)   
 *对用户的key password 进行md5加密，
 *key和password 会为每个渠道分配不同的值
 */
2: required string sign;
}
/**
 * 错误信息
 */
struct BusError{
	/**
	 * 错误代码  0000 代表成功
	 */
	1:string errorCode='0000';
 	/**
	 * 错误描述
	 */
	2:string errorDesc;
}
/**
 * 退票申请请求VO
 */
struct TRefundOrderApplyReq{ 
 
}
/**
 * 退票申请响应VO
 */
struct TRefundOrderApplyResp{ 
 
}
/**
 * 修改退票金额请求VO
 */
struct TChangeRefundOrderAmountReq{

}
/**
 * 修改退票金额响应VO
 */
struct TChangeRefundOrderAmountResp{

}

/**
 * 修改退票状态请求VO
 */
struct TChangeRefundOrderStatusReq{

}
/**
 * 修改退票状态响应VO
 */
struct TChangeRefundOrderStatusResp{

}

/**
 * 修改出票状态请求VO
 */
struct TChangeTicketStatusReq{

}
/**
 * 修改出票状态响应VO
 */
struct TChangeTicketStatusResp{

}

/**
 * 修改取票状态请求VO
 */
struct TChangeTicketRecStatusReq{ 
/**
 * 车票id
 */
1:required i64 exBusOrderId,
/**
 * 修改后的取票状态
 */
2:required string ticketRecStatus, 
/**
 * 取票码
 */
3:required string ticketRecRandomCode,
/**
 * 取票渠道
 */
4:required string recTicketChanelName,
/**
 * 取票渠道id
 */
5:optional i64 recTicketChanelId,
/**
 * 取票用户id
 */
6:optional i64 userId,
/**
 * 取票用户名
 */
7:required string userName,
}
/**
 * 修改取票状态响应VO
 */
struct TChangeTicketRecStatusResp{
1:BusError busError
}

/**
 * 获取取票码请求VO
 */
struct TGenerateTicketRecRandomReq{

}
/**
 * 获取取票码响应VO
 */
struct TGenerateTicketRecRandomResp{

}
/**
 * 根据外部订单号修改出票状态请求VO
 */
struct TChangeTicketStatusByExOrderIdReq{
/**
 * 购票的渠道id
 */
1:optional i64 channelId,
/**
 * 外部订单号
 */
2:optional string exOrderId,
/**
 * 需要修改为的订单状态
 */
3:optional string ticketStatus,
/**
 * 修改出票状态用户id
 */
4:optional i64 userId,
/**
 * 修改出票状态用户名称
 */
5:optional string userName
}
/**
 * 根据外部订单号修改出票状态响应VO
 */
struct TChangeTicketStatusByExOrderIdResp{
/**
 * 错误代码 描述
 */
1:BusError busError
}

/**
 * 根据外部订单号修改退票状态请求VO
 */
struct TChangeRefundOrderStatusByExOrderIdReq{

}
/**
 * 根据外部订单号修改退票状态响应VO
 */
struct TChangeRefundOrderStatusByExOrderIdResp{

}

/**
 * 根据外部订单号修改取票状态请求VO
 */
struct TChangeTicketRecStatusByExOrderIdReq{
	/**
	 * 外部订单号
	 */
	1:required string exOrderId,
	/**
	 * 取票状态
	 */
	2:required string ticketRecStatus,
	/**
	 * 取票码
	 */
	3:required map<i64,string> ticketRecRandomCodeMap, 
	/**
	 * 预订渠道id
	 */
	4:required i64 channelId,
	/**
	 * 取票渠道名称
	 */
	5:optional string recTicketChannelName,
	/**
	 * 取票渠道
	 */
	6:optional i64 recTicketChannelId,
	/**
	 * 取票人姓名
	 */
	7:required string recTicketUserName,
	/**
	 * 取票人id
	 */
	8:required i64 recTicketUserId
}
/**
 * 根据外部订单号修改取票状态响应VO
 */
struct TChangeTicketRecStatusByExOrderIdResp{
/**
 * 错误代码 描述
 */
1:BusError busError
}
service BackService {
	
	/**
	 * 申请退票  ---外部调用【发送消息】-- 如果自动退票上了 则异步自动退票
	 * @author Administrator
	 * @throws Exception 
	 */
	TRefundOrderApplyResp refundOrderApply(1:TRefundOrderApplyReq trefundorderapplyreq) 
	/**
	 * 修改退款金额
	 * @author Administrator
	 */
	TChangeRefundOrderAmountResp changeRefundOrderAmount(1:TChangeRefundOrderAmountReq tchangerefundorderamountreq)
	/**
	 * 修改退改状态 退票成功  失败 两种状态【发送消息】-- 需要异步更新线路
	 * @author Administrator
	 * @throws Exception 
	 */
	TChangeRefundOrderStatusResp changeRefundOrderStatus(1:TChangeRefundOrderStatusReq tchangerefundorderstatusreq) 
	 
	/**
	 * 修改出票状态  出票成功失败两种状态【发送消息】-- 需要异步更新线路 
	 * @author Administrator
	 * @throws Exception 
	 */
	TChangeTicketStatusResp changeTicketStatus(1:TChangeTicketStatusReq tchangeticketstatusreq) 
	/**
	 * 修改订单取票状态--- 已取票 未取票【发送消息】
	 * @author Administrator
	 * @throws Exception 
	 */
	TChangeTicketRecStatusResp changeTicketRecStatus(1:TChangeTicketRecStatusReq tchangeticketrecstatusreq) 
	/**
	 * 生成取票随机码 12位 有几张票生成几张 格式为 ：12位数字-index
	 * @author Administrator
	 * @return 返回 String[]
	 * @throws Exception 
	 */
	TGenerateTicketRecRandomResp generateTicketRecRandom(1:TGenerateTicketRecRandomReq tgenerateticketrecrandomreq) 
	/**
	 * 修改出票状态  根据外部订单号---------------------ok
	 * @author Administrator
	 * @throws Exception 
	 * @throws Exception 
	 */
	TChangeTicketStatusByExOrderIdResp changeTicketStatusByExOrderId(1:TChangeTicketStatusByExOrderIdReq tchangeticketstatusbyexorderidreq) 
	/**
	 * 根据外部订单号修改退票状态
	 * @author lixun
	 * @date 2014-3-22 下午12:27:31
	 * @param changerefundorderstatusbyexorderidreq
	 * @return
	 * @throws Exception
	 */
	TChangeRefundOrderStatusByExOrderIdResp changeRefundOrderStatusByExOrderId(1:TChangeRefundOrderStatusByExOrderIdReq tchangerefundorderstatusbyexorderidreq) 
	/**
	 * 修改订单取票状态 根据外部订单号--- 已取票 未取票【发送消息】---------------------ok
	 * @author Administrator
	 * @throws Exception 
	 */
	TChangeTicketRecStatusByExOrderIdResp changeTicketRecStatusByExOrderId(1:TChangeTicketRecStatusByExOrderIdReq tchangeticketrecstatusbyexorderidreq) 
	
}