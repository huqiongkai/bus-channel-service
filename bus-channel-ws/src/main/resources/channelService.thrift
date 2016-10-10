/*
 * 此服务为汽车票的查询预订服务接口，基于thrift框架，目前只提供http服务
 */
namespace java com.shbus.easybus.thrift.front
namespace csharp com.shbus.easybus.thrift.front
namespace php com.shbus.easybus.thrift.front
/**
 * 预定时使用-证件类型
 */
enum CertificateType{
/**
 * 预定时使用-证件类型-身份证
 */
id=0,
/**
 * 预定时使用-证件类型-护照
 */
passport=1,
/**
 * 预定时使用-证件类型-军官证
 */
militaryCard=2,
/**
 * 预定时使用-证件类型-回乡证
 */
hvps=3,
/**
 * 预定时使用-证件类型-台胞证
 */
mtps=4
}

 /**
 * 上海车站代码-客运南站
 */  
const string UNIT_ID_KYNZ = "2000000021"
/**
 * 上海车站代码-浦东长途东站
 */
const string UNIT_ID_PDCTDZ = "1000201"
/**
 * 上海车站代码-虹桥长途西站
 */
const string UNIT_ID_HQCTXZ = "1000202"
/**
 * 上海车站代码-沪太路客运站
 */
const string UNIT_ID_HTLKYZ = "1000203"
/**
 * 上海车站代码-川沙客运站
 */
const string UNIT_ID_CSKYZ = "1000204"
/**
 * 上海车站代码-上海长途北站
 */
const string UNIT_ID_CTBZ = "1000205"
/**
 * 上海车站代码-高桥客运站
 */
const string UNIT_ID_GQKYZ = "1000206"
/**
 * 上海车站代码-南汇客运站
 */
const string UNIT_ID_NHKYZ = "1000207"
/**
 * 上海车站代码-吴淞客运站
 */
const string UNIT_ID_WSKYZ = "1000208"

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
 * 查询班次请求（注意如果需要缓存数据则 只需要输入出发站编号即可 建议刷新频率20分钟）
 */
struct QueryBusReq{
/**
 * 身份验证 
 */
1:required AuthVO authVO
/**
 * 出发车站编号 （必填） 
 */
2: required string unitId;
/**
 * 到达车站编号（可不填，不填则查询所有线路）
 */
3: optional string toStationId;
/**
 * 出发日期 格式 yyyyMMdd（可不填，不填则查询所有日期的线路）
 */
4: optional string departDateyyyyMMdd;
/**
 * 线路唯一标示
 */
5: optional string rtOrderId;
/**
 * 车次编号
 */
6: optional string rtOrderCode;
/**
 * 是否包含打包产品 默认不包含打包产品   ONLYPKG:只包含打包产品  ONLYBUS：不包含打包产品   ALL:全部
 */
7: optional string includePkg;
} 

/**
 * 车次配额信息VO
 */
struct BusQuotaVO{
/**
 * 剩余座位数量
 */
1:i32 remainSeats
}
/**
 * 车次价格信息VO
 */
struct BusPriceVO{
	/**
	 * 票价id(暂时不用)
	 */
	1: string priceId ;
	/**
	 * 全票价
	 */
	2: i32 priceFull ;
	/**
	 * 半票价(暂时不用)
	 */
	3: i32 priceSemi ;
	/**
	 * 基准票价(暂时不用)
	 */
	4: i32 basePriceFull ;
	/**
	 * 基准半票价(暂时不用)
	 */
	5: i32 basePriceSemi ;
}

/**
 * 中国行政区域信息
 */
struct SysChinaRegion{ 
	/**
	 * 区域6字码
	 */
	1:string regionCode6; 
	/**
	 * 区域三字码
	 */
	2:string regionCode3; 
	/**
	 * 区域中文名称
	 */
	3:string regionCnname; 
	/**
	 * 所在区域拼音
	 */
	4:string regionPinyin; 
	/**
	 * 所在省份中文名称
	 */
	5:string parentProvinceCnname; 
	/**
	 * 所在省份拼音
	 */
	6:string parentProvincePinyin; 
	/**
	 * 所在省份6字代码
	 */
	7:string parentProvinceCode6; 
	/**
	 * 所在城市中文名称
	 */
	8:string parentCityCnname;
	/**
	 * 所在城市拼音
	 */	
	9:string parentCityPinyin; 
	/**
	 * 所在城市行政区划6字码（字母 开头的属于自定义的代码）
	 */
	10:string parentCityCode6; 
	/**
	 * 所在城市三字码
	 */
	11:string parentCityCode3;
}
/**
 * 车次基本信息VO
 */
struct BusBasicInfoVO{
	/**
	 * 到达省份ID
	 */
	1: string toProvinceId ;
	/**
	 * 到达省份名称
	 */
	2: string toProvinceName ; 
	/**
	 * 始发站 车站类型
	 */
	3: string pthallType ;
	/**
	 * 是否复制加班  加班状态
	 */
	4: string overtimeStatus ;
	/**
	 * 承运公司许可证
	 */
	5: string busLicenseId ;
	/**
	 * 车辆类型 
	 */
	6: string busTypeId ;
	/**
	 * 车辆等级
	 */
	7: string busGradeId ;
	/**
	 * 车公司代码
	 */
	8: string carrierId ;
	/**
	 * 车公司名称
	 */
	9: string carrierName ;
	/**
	 * 车辆可载客人数
	 */
	10: string capacity ;
	/**
	 * 班次状态
	 */
	11: string stopType ;
	/**
	 * 检票口代码
	 */
	12: string ticketGateId ;
	/**
	 * 检票口名称
	 */
	13: string ticketGateName ;
	/**
	 * 备注
	 */
	14: string remark ;
	/**
	 * 出发地行政区域信息
	 */
	15: SysChinaRegion depart;
	/**
	 * 目的地行政区域信息
	 */
	16: SysChinaRegion arrive;
	/**
	 * 出发时间
	 */
	17:string pleaveDtyyyyMMddHHmmss;
	/**
	 * 车次编号
	 */
	18: string rtorderCode;
	/**
	 * 出发车站编号
	 */
	19: string unitId;
	/**
	 * 到达车站编号
	 */
	20: string toStationId;
	/**
	 * 到达车站名称
	 */
	21: string toStationName;
	/**
	 * 车次id
	 */
	22: string rtorderId; 
	/**
	 * 出票系统代码
	 */
	23: string sysCode;
}

/**
 * 非车票元素规则VO
 */
struct BusPkgInfoEleVO {
/**
 * 元素id
 */
1:i64 exEleId;
/**
 * 元素使用日期
 */
2:i64 date;
/**
 * 元素数量
 */
3:i64 eleCount;
/**
 * 元素名称
 */
4:string eleName;
/**
 * 元素描述
 */
5:string eleDesc;
}
/**
 * 车票元素规则VO
 */
struct BusPkgInfoBusVO {
/**
 * 出发地id
 */
1:string unitId;
/**
 * 目的地id
 */
2:string toStationId;
/**
 * 出票系统
 */
3:string sysCode;
/**
 * 出发日期
 */
4:i64 departDate;
/**
 * 车次编号
 */
5:string rtOrderCode;
/**
 * 车票数量
 */
6:i64 busCount;
/**
 * 可用数量
 */
7:i64 remainCount;
/**
 * 车票元素规则VO
 */
8:i64 fullPrice;
}
/**
 * 车次打包信息VO
 */
struct BusPkgVO
{
/**
 * 套餐名称
 */
1: string pkgName;
/**
 * 套餐描述
 */
2: string pkgDesc;
/**
 * 打包规则模板id
 */
3: i64 exBusPkgId;
/**
 * 打包非车票规则
 */
4: set<BusPkgInfoEleVO> busPkgInfoEleList;
/**
 * 打包车票规则
 */
5: set<BusPkgInfoBusVO> busPkgInfoBusList;
}


/**
 * 车次信息VO
 */
struct BusAllInfoVO{
/**
 * 车次价格信息VO
 */
1: BusPriceVO busPriceVO;
/**
 * 车次基本信息VO
 */
2: BusBasicInfoVO busBasicInfoVO;
/**
 * 车次配额信息VO
 */
3: BusQuotaVO busQuotaVO;
/**
 * 车次打包信息VO
 */
4: BusPkgVO busPkgVO;
}
/**
 * 查询车次信息 响应
 */
struct QueryBusResp{
/**
 * 车次信息列表
 */
1:set<BusAllInfoVO> busAllInfoVOList;
/**
 * 错误信息
 */
2:BusError busError;
}
/**
 *订单查询请求 如需轮询 建议刷新频率为10分钟 分页调用
 */
struct OrderSearchReq{
	/**
	 * 身份验证 
	 */
	1:required AuthVO authVO
	/**
	 * 外部订单号
	 */
	2:optional string exOrderId;
	/**
	 * 取票码
	 */
	3:optional string ticketRecRandomCode;
	/**
	 * 取票状态 NONE:无申请 ,APP:处理中,FAIL:失败,SUC:成功;
	 */
	4:optional string ticketRecStatus; 
	/**
	 * 出票状态 NONE:无申请 ,APP:处理中,FAIL:失败,SUC:成功;
	 */
	5:optional string ticketStatus;
	/**
	 * 出票时间  （查询时间范围-开始  yyyyMMdd）
	 */
	6:optional string ticketConfirmDateBegin;
	/**
	 * 出票时间  （查询时间范围-结束 yyyyMMdd）
	 */
	7:optional string ticketConfirmDateEnd;
	/**
	 * 取票时间  （查询时间范围-开始 yyyyMMdd）
	 */
	8:optional string ticketRecDateBegin;
	/**
	 * 取票时间  （查询时间范围-结束 yyyyMMdd）
	 */
	9:optional string ticketRecDateEnd;
	/**
	 * 客人姓名
	 */
	10:optional string psgName;
	/**
	 * 证件类型
	 */
	11:optional CertificateType psgCertificateType;
	/**
	 * 证件号
	 */
	12:optional string psgCertificateNo;
	/**
	 * 手机号
	 */
	13:optional string psgMobile;
	/**
	 * 第几页  每页默认10个 第一页从1开始
	 */
	14:required i32 pageIndex=1;
	/**
	 * 是否测试订单   Y:测试订单  N:非测试订单
	 */
	15:required string isTestOrder='N';
	/**
	 * 创建时间  （查询时间范围-开始  yyyyMMdd）
	 */
	16:optional string ticketCreateDateBegin;
	/**
	 * 创建时间  （查询时间范围-结束 yyyyMMdd）
	 */
	17:optional string ticketCreateDateEnd;
}
/**
 * 订单信息
 */
struct ExBusOrder{
	/**
	 * 主键
	 */
	1:i64 id;
	/**
	 * 修改时间   yyyyMMddHHmmss
	 */
	2:string modifyDatetime;
	/**
	 * 备注
	 */
	3:string remark;
	/**
	 * 创建时间  yyyyMMddHHmmss
	 */
	4:string createDate;
	/**
	 * 外部 订单号
	 */
	5:string  exOrderId;
	/**
	 * 班次id
	 */
	6:string  rtorderId;
	/**
	 * 班次号
	 */
	7:string  rtorderCode;
	/**
	 * 出发车站编号
	 */
	8:string  unitId;
	/**
	 * 到达车站编号
	 */
	9:string  toStationId;
	/**
	 * 车辆发车时间 yyyyMMddHHmmss
	 */
	10:string pleaveDtyyyyMMddHHmmss;
	/**
	 * 到站名称
	 */
	11:string  toStationName;
	/**
	 * 到达车站6字码
	 */
	12:string  toStation6code;
	/**
	 * 出发车站名称
	 */
	13:string  fromStationName;
	/**
	 * 出发车站6字码
	 */
	14:string  fromStation6code;
	/**
	 * 到达省份名称
	 */
	15:string  toProvinceName;
	/**
	 * 到达省份6字码
	 */
	16:string  toProvince6code;
	/**
	 * 出发省份名称
	 */
	17:string  fromProvinceName;
	/**
	 * 出发省份6字代码
	 */
	18:string  fromProvince6code;
	/**
	 * 出票失败原因(暂时不用)
	 */
	19:string  ticketFailReason;
	/**
	 * 车票状态 
	 */
	20:string  ticketStatus;
	/**
	 * 出票时间 yyyyMMddHHmmss
	 */ 
	21:string ticketConfirmDate;
	/**
	 * 取票状态
	 */
	22:string  ticketRecStatus;
	/**
	 * 取票时间 yyyyMMddHHmmss
	 */
	23:string ticketRecDate;
	/**
	 * 车票结算价格
	 */
	24:i32 ticketPrice;
	/**
	 * 取票码
	 */
	25:string  ticketRecRandomCode;
	/**
	 * 乘客姓名
	 */
	26:string  psgName;
	/**
	 * 证件类型
	 */
	27:CertificateType  psgCertificateType;
	/**
	 * 证件号
	 */
	28:string  psgCertificateNo;
	/**
	 *手机号 
	 */
	29:string  psgMobile;
	/**
	 * 是否测试订单   Y:测试订单  N:非测试订单
	 */
	30:string isTestOrder;
	/**
	 * 检票口 --仅用做打印在车票上使用
	 */
	31:string ticketGateName;
	/**
	 * 座位号码 --仅用做打印在车票上使用
	 */
	32:string ticketSeatSeq;
	/**
	 * 出票人姓名 --仅用做打印在车票上使用
	 */
	33:string ticketUserDisplayName;	
	/**
	 * 出票站点名称 --仅用做打印在车票上使用
	 */
	34:string ticketSaleCorp;
	/**
	 * 出票站点地址 --仅用做打印在车票上使用
	 */
	35:string ticketStationAddr;
	/**
	 * 票面类型  --仅用做打印在车票上使用
	 */
	36:string ticketType;
	/**
	 * 出票时间戳 --仅用做打印在车票上使用
	 */
	37:string ticketSaleTime;
	/**
	 * 车票号
	 */
	38:string busTicketNo;
	/**
	 * 车票序号
	 */
	39:i32 exOrderIdIndex;
	/**
	 * 短信发送内容
	 */
	40:string channelSms;
	/**
	 * 退改规定
	 */
	41:string refundDesc;
	/**
	 * 套餐名称
	 */
	42:string pkgName;
	/**
	 * 套餐描述
	 */
	43:string pkgDesc;
	/**
	 * 车票展示价格，票面价，打印在车票中
	 */
	44:i32 ticketDisplayPrice;
	/**
	 * 套餐总价  对于非打包产品显示 整张订单总价
	 */
	45:i32 orderTotalPrice;
	
}
/**
 * 订单查询响应
 */
struct OrderSearchResp{
/**
 * 订单信息 默认10个 
 */
1:list<ExBusOrder> result;
/**
 * 错误信息
 */
2:BusError busError;
}
/**
 * 预定时客人信息
 */
struct PsgInfo{
	/**
	 * 客人姓名
	 */
	1:required string psgName;
	/**
	 * 证件号
	 */
	2:required string psgCertificateNo;
	/**
	 * 证件类型
	 */
	3:required CertificateType psgCertificateType;
	/**
	 * 订单客人手机号
	 */
	4:required string mobile;
}
/**
 * 订单预订请求
 */
struct OrderBookReq{
	/**
	 * 身份验证 
	 */
	1:required AuthVO authVO
	/**
	 * 车次id
	 */
	2:required string rtOrderId;
	/**
	 * 总价
	 */
	3:required i32 totalPrice;
	/**
	 * 车票数量
	 */
	4:required i32 ticketCount;
	/**
	 * 出发时间 yyyyMMddHHmmss
	 */
	5:required string pleaveDtyyyyMMddHHmmss;
	/**
	 * 单价
	 */
	6:required i32 ticketPrice;
	/**
	 * 外部 订单号 请保证唯一
	 */
	7:required string exOrderId;
	/**
	 * 出发车站编号
	 */
	8:required string unitId;
	/**
	 * 到达车站编号
	 */
	9:required string toStationId;
	/**
	 * 订单客人信息
	 */
	10:required list<PsgInfo> psgList; 
	/**
	 * 是否测试订单   Y:测试订单  N:非测试订单
	 */
	11:required string isTestOrder='Y';
}

/**
 * 订单预订响应
 */
struct OrderBookResp{
 	/**
	 * 错误信息
	 */
	1:BusError busError;
	 /**
	 * 外部订单号
	 */
	2:string exOrderId;
}
struct ChangeTicketRecStatusToYesReq
{
	/**
	 * 身份验证 
	 */
	1:required AuthVO authVO
	/**
	 * 外部订单号
	 */
	2:required string exOrderId
}
struct ChangeTicketRecStatusToYesResp
{
 	/**
	 * 错误信息
	 */
	1:BusError busError;
}
/**
 * 渠道服务  查询 预订 请通过thrift的http协议访问 目前只开通http协议
 */
service ChannelService{
/**
 * 订单查询--注意每张车票都是一条记录，如果一个订单有多个车票则存在多个记录
 */
OrderSearchResp orderSearch(1:OrderSearchReq req) 
/**
 * 预订 此接口可以通过不同的参数来区分 
 * 订单式测试单还是正式单 
 * 注意测试订单会定期被删除
 */
OrderBookResp orderBook(1:OrderBookReq req)
/**
 * 班次查询
 */
QueryBusResp busSearch(1:QueryBusReq req)
/**
 * 将车票的取票状态置为已取票
 */
ChangeTicketRecStatusToYesResp changeTicketRecStatusToYes(1:ChangeTicketRecStatusToYesReq req)
}