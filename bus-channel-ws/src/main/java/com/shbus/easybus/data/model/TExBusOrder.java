package com.shbus.easybus.data.model;

import java.util.Date;

public class TExBusOrder {
    private Long id;

    private Date modifyDatetime;

    private Long lastOpId;

    private String remark;

    private String supplierId;

    private String valid;

    private Date createDate;

    private Long createOpId;

    private String teamNo;

    private Long pProductId;

    private Long exOrderIdIndex;

    private String exOrderId;

    private String rtorderId;

    private String rtorderCode;

    private String unitId;

    private String toStationId;

    private Date pleaveDt;

    private String toStationName;

    private String toStation6code;

    private String fromStationName;

    private String fromStation6code;

    private String toProvinceName;

    private String toProvince6code;

    private String fromProvinceName;

    private String fromProvince6code;

    private String busTicketNo;

    private String ticketFailReason;

    private String ticketRefundFailReason;

    private String ticketStatus;

    private Date ticketApplyDate;

    private Date ticketConfirmDate;

    private String ticketRecStatus;

    private Date ticketRecDate;

    private String ticketRefundStatus;

    private Date ticketRefundApplyDate;

    private Date ticketRefundConfirmDate;

    private Double ticketRefundAmount;

    private Double ticketPrice;

    private Double ticketPriceDiscount;

    private String channelName;

    private Long channelId;

    private String ticketRecRandomCode;

    private String orderPackageId;

    private Long version;

    private Double factAmountRec;

    private Double factAmountRefund;

    private Long exOrderTicketCount;

    private String psgName;

    private String psgCertificateType;

    private String psgCertificateNo;

    private String psgMobile;

    private String isTestOrder;

    private String recTicketChanelName;

    private Long recTicketChanelId;

    private String ticketGateName;

    private String ticketSeatSeq;

    private String ticketUserDisplayName;

    private String ticketUserName;

    private String ticketSaleCorp;

    private String ticketStationAddr;

    private String ticketType;

    private String ticketSaleTime;

    private Long recTicketUserId;

    private String recTicketUserName;

    private Long confirmTicketUserId;

    private String confirmTicketUserName;

    private Long failTicketUserId;

    private String failTicketUserName;

    private Long invalidPrintCount;

    private String sysCodeName;

    private String sysCode;

    private String rawToStationId;

    private String rawToStationName;

    private String rawUnitId;

    private String rawUnitName;

    private String pkgOrderStatus;

    private Date pkgConfirmDate;

    private String pkgName;

    private String pkgDesc;

    private String pkgDescInternal;

    private String pkgRefundDesc;

    private String pkgType;

    private String pkgSms;

    private String ticketUseStatus;

    private Long originExOrderIdIndex;

    private String originExOrderId;

    private Double settlementPrice;

    private Double settlementRebate;

    private String salePriceCalType;

    private Double pkgSalePrice;

    private String pkgTypeName;

    private String ticketUseStatusName;

    private String pkgOrderStatusName;

    private Long exBusOrderPkgId;

    private String carrierName;

    private String salePriceCalTypeName;

    private Long exBusStockId;

    private Long pkgSaleCount;

    private Long eleSupplierId;

    private String eleSupplierCode;

    private String eleSupplierName;

    private String settlementType;

    private String settlementTypeName;

    private String ticketUseStatusSynStatus;

    private Date ticketUseStatusCheckedDate;

    private Date ticketUseStatusRefundDate;

    private Date ticketUseStatusInvalidDate;

    private String ticketUseStatusCheckedOp;

    private String ticketUseStatusRefundOp;

    private String ticketUseStatusInvalidOp;

    private Double ticketRefundAmountSys;

    private Double ticketRefundFeeSys;

    private String ticketUseStatusSynStatusN;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getModifyDatetime() {
        return modifyDatetime;
    }

    public void setModifyDatetime(Date modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }

    public Long getLastOpId() {
        return lastOpId;
    }

    public void setLastOpId(Long lastOpId) {
        this.lastOpId = lastOpId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId == null ? null : supplierId.trim();
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateOpId() {
        return createOpId;
    }

    public void setCreateOpId(Long createOpId) {
        this.createOpId = createOpId;
    }

    public String getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(String teamNo) {
        this.teamNo = teamNo == null ? null : teamNo.trim();
    }

    public Long getpProductId() {
        return pProductId;
    }

    public void setpProductId(Long pProductId) {
        this.pProductId = pProductId;
    }

    public Long getExOrderIdIndex() {
        return exOrderIdIndex;
    }

    public void setExOrderIdIndex(Long exOrderIdIndex) {
        this.exOrderIdIndex = exOrderIdIndex;
    }

    public String getExOrderId() {
        return exOrderId;
    }

    public void setExOrderId(String exOrderId) {
        this.exOrderId = exOrderId == null ? null : exOrderId.trim();
    }

    public String getRtorderId() {
        return rtorderId;
    }

    public void setRtorderId(String rtorderId) {
        this.rtorderId = rtorderId == null ? null : rtorderId.trim();
    }

    public String getRtorderCode() {
        return rtorderCode;
    }

    public void setRtorderCode(String rtorderCode) {
        this.rtorderCode = rtorderCode == null ? null : rtorderCode.trim();
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getToStationId() {
        return toStationId;
    }

    public void setToStationId(String toStationId) {
        this.toStationId = toStationId == null ? null : toStationId.trim();
    }

    public Date getPleaveDt() {
        return pleaveDt;
    }

    public void setPleaveDt(Date pleaveDt) {
        this.pleaveDt = pleaveDt;
    }

    public String getToStationName() {
        return toStationName;
    }

    public void setToStationName(String toStationName) {
        this.toStationName = toStationName == null ? null : toStationName.trim();
    }

    public String getToStation6code() {
        return toStation6code;
    }

    public void setToStation6code(String toStation6code) {
        this.toStation6code = toStation6code == null ? null : toStation6code.trim();
    }

    public String getFromStationName() {
        return fromStationName;
    }

    public void setFromStationName(String fromStationName) {
        this.fromStationName = fromStationName == null ? null : fromStationName.trim();
    }

    public String getFromStation6code() {
        return fromStation6code;
    }

    public void setFromStation6code(String fromStation6code) {
        this.fromStation6code = fromStation6code == null ? null : fromStation6code.trim();
    }

    public String getToProvinceName() {
        return toProvinceName;
    }

    public void setToProvinceName(String toProvinceName) {
        this.toProvinceName = toProvinceName == null ? null : toProvinceName.trim();
    }

    public String getToProvince6code() {
        return toProvince6code;
    }

    public void setToProvince6code(String toProvince6code) {
        this.toProvince6code = toProvince6code == null ? null : toProvince6code.trim();
    }

    public String getFromProvinceName() {
        return fromProvinceName;
    }

    public void setFromProvinceName(String fromProvinceName) {
        this.fromProvinceName = fromProvinceName == null ? null : fromProvinceName.trim();
    }

    public String getFromProvince6code() {
        return fromProvince6code;
    }

    public void setFromProvince6code(String fromProvince6code) {
        this.fromProvince6code = fromProvince6code == null ? null : fromProvince6code.trim();
    }

    public String getBusTicketNo() {
        return busTicketNo;
    }

    public void setBusTicketNo(String busTicketNo) {
        this.busTicketNo = busTicketNo == null ? null : busTicketNo.trim();
    }

    public String getTicketFailReason() {
        return ticketFailReason;
    }

    public void setTicketFailReason(String ticketFailReason) {
        this.ticketFailReason = ticketFailReason == null ? null : ticketFailReason.trim();
    }

    public String getTicketRefundFailReason() {
        return ticketRefundFailReason;
    }

    public void setTicketRefundFailReason(String ticketRefundFailReason) {
        this.ticketRefundFailReason = ticketRefundFailReason == null ? null : ticketRefundFailReason.trim();
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus == null ? null : ticketStatus.trim();
    }

    public Date getTicketApplyDate() {
        return ticketApplyDate;
    }

    public void setTicketApplyDate(Date ticketApplyDate) {
        this.ticketApplyDate = ticketApplyDate;
    }

    public Date getTicketConfirmDate() {
        return ticketConfirmDate;
    }

    public void setTicketConfirmDate(Date ticketConfirmDate) {
        this.ticketConfirmDate = ticketConfirmDate;
    }

    public String getTicketRecStatus() {
        return ticketRecStatus;
    }

    public void setTicketRecStatus(String ticketRecStatus) {
        this.ticketRecStatus = ticketRecStatus == null ? null : ticketRecStatus.trim();
    }

    public Date getTicketRecDate() {
        return ticketRecDate;
    }

    public void setTicketRecDate(Date ticketRecDate) {
        this.ticketRecDate = ticketRecDate;
    }

    public String getTicketRefundStatus() {
        return ticketRefundStatus;
    }

    public void setTicketRefundStatus(String ticketRefundStatus) {
        this.ticketRefundStatus = ticketRefundStatus == null ? null : ticketRefundStatus.trim();
    }

    public Date getTicketRefundApplyDate() {
        return ticketRefundApplyDate;
    }

    public void setTicketRefundApplyDate(Date ticketRefundApplyDate) {
        this.ticketRefundApplyDate = ticketRefundApplyDate;
    }

    public Date getTicketRefundConfirmDate() {
        return ticketRefundConfirmDate;
    }

    public void setTicketRefundConfirmDate(Date ticketRefundConfirmDate) {
        this.ticketRefundConfirmDate = ticketRefundConfirmDate;
    }

    public Double getTicketRefundAmount() {
        return ticketRefundAmount;
    }

    public void setTicketRefundAmount(Double ticketRefundAmount) {
        this.ticketRefundAmount = ticketRefundAmount;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Double getTicketPriceDiscount() {
        return ticketPriceDiscount;
    }

    public void setTicketPriceDiscount(Double ticketPriceDiscount) {
        this.ticketPriceDiscount = ticketPriceDiscount;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getTicketRecRandomCode() {
        return ticketRecRandomCode;
    }

    public void setTicketRecRandomCode(String ticketRecRandomCode) {
        this.ticketRecRandomCode = ticketRecRandomCode == null ? null : ticketRecRandomCode.trim();
    }

    public String getOrderPackageId() {
        return orderPackageId;
    }

    public void setOrderPackageId(String orderPackageId) {
        this.orderPackageId = orderPackageId == null ? null : orderPackageId.trim();
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Double getFactAmountRec() {
        return factAmountRec;
    }

    public void setFactAmountRec(Double factAmountRec) {
        this.factAmountRec = factAmountRec;
    }

    public Double getFactAmountRefund() {
        return factAmountRefund;
    }

    public void setFactAmountRefund(Double factAmountRefund) {
        this.factAmountRefund = factAmountRefund;
    }

    public Long getExOrderTicketCount() {
        return exOrderTicketCount;
    }

    public void setExOrderTicketCount(Long exOrderTicketCount) {
        this.exOrderTicketCount = exOrderTicketCount;
    }

    public String getPsgName() {
        return psgName;
    }

    public void setPsgName(String psgName) {
        this.psgName = psgName == null ? null : psgName.trim();
    }

    public String getPsgCertificateType() {
        return psgCertificateType;
    }

    public void setPsgCertificateType(String psgCertificateType) {
        this.psgCertificateType = psgCertificateType == null ? null : psgCertificateType.trim();
    }

    public String getPsgCertificateNo() {
        return psgCertificateNo;
    }

    public void setPsgCertificateNo(String psgCertificateNo) {
        this.psgCertificateNo = psgCertificateNo == null ? null : psgCertificateNo.trim();
    }

    public String getPsgMobile() {
        return psgMobile;
    }

    public void setPsgMobile(String psgMobile) {
        this.psgMobile = psgMobile == null ? null : psgMobile.trim();
    }

    public String getIsTestOrder() {
        return isTestOrder;
    }

    public void setIsTestOrder(String isTestOrder) {
        this.isTestOrder = isTestOrder == null ? null : isTestOrder.trim();
    }

    public String getRecTicketChanelName() {
        return recTicketChanelName;
    }

    public void setRecTicketChanelName(String recTicketChanelName) {
        this.recTicketChanelName = recTicketChanelName == null ? null : recTicketChanelName.trim();
    }

    public Long getRecTicketChanelId() {
        return recTicketChanelId;
    }

    public void setRecTicketChanelId(Long recTicketChanelId) {
        this.recTicketChanelId = recTicketChanelId;
    }

    public String getTicketGateName() {
        return ticketGateName;
    }

    public void setTicketGateName(String ticketGateName) {
        this.ticketGateName = ticketGateName == null ? null : ticketGateName.trim();
    }

    public String getTicketSeatSeq() {
        return ticketSeatSeq;
    }

    public void setTicketSeatSeq(String ticketSeatSeq) {
        this.ticketSeatSeq = ticketSeatSeq == null ? null : ticketSeatSeq.trim();
    }

    public String getTicketUserDisplayName() {
        return ticketUserDisplayName;
    }

    public void setTicketUserDisplayName(String ticketUserDisplayName) {
        this.ticketUserDisplayName = ticketUserDisplayName == null ? null : ticketUserDisplayName.trim();
    }

    public String getTicketUserName() {
        return ticketUserName;
    }

    public void setTicketUserName(String ticketUserName) {
        this.ticketUserName = ticketUserName == null ? null : ticketUserName.trim();
    }

    public String getTicketSaleCorp() {
        return ticketSaleCorp;
    }

    public void setTicketSaleCorp(String ticketSaleCorp) {
        this.ticketSaleCorp = ticketSaleCorp == null ? null : ticketSaleCorp.trim();
    }

    public String getTicketStationAddr() {
        return ticketStationAddr;
    }

    public void setTicketStationAddr(String ticketStationAddr) {
        this.ticketStationAddr = ticketStationAddr == null ? null : ticketStationAddr.trim();
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType == null ? null : ticketType.trim();
    }

    public String getTicketSaleTime() {
        return ticketSaleTime;
    }

    public void setTicketSaleTime(String ticketSaleTime) {
        this.ticketSaleTime = ticketSaleTime == null ? null : ticketSaleTime.trim();
    }

    public Long getRecTicketUserId() {
        return recTicketUserId;
    }

    public void setRecTicketUserId(Long recTicketUserId) {
        this.recTicketUserId = recTicketUserId;
    }

    public String getRecTicketUserName() {
        return recTicketUserName;
    }

    public void setRecTicketUserName(String recTicketUserName) {
        this.recTicketUserName = recTicketUserName == null ? null : recTicketUserName.trim();
    }

    public Long getConfirmTicketUserId() {
        return confirmTicketUserId;
    }

    public void setConfirmTicketUserId(Long confirmTicketUserId) {
        this.confirmTicketUserId = confirmTicketUserId;
    }

    public String getConfirmTicketUserName() {
        return confirmTicketUserName;
    }

    public void setConfirmTicketUserName(String confirmTicketUserName) {
        this.confirmTicketUserName = confirmTicketUserName == null ? null : confirmTicketUserName.trim();
    }

    public Long getFailTicketUserId() {
        return failTicketUserId;
    }

    public void setFailTicketUserId(Long failTicketUserId) {
        this.failTicketUserId = failTicketUserId;
    }

    public String getFailTicketUserName() {
        return failTicketUserName;
    }

    public void setFailTicketUserName(String failTicketUserName) {
        this.failTicketUserName = failTicketUserName == null ? null : failTicketUserName.trim();
    }

    public Long getInvalidPrintCount() {
        return invalidPrintCount;
    }

    public void setInvalidPrintCount(Long invalidPrintCount) {
        this.invalidPrintCount = invalidPrintCount;
    }

    public String getSysCodeName() {
        return sysCodeName;
    }

    public void setSysCodeName(String sysCodeName) {
        this.sysCodeName = sysCodeName == null ? null : sysCodeName.trim();
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    public String getRawToStationId() {
        return rawToStationId;
    }

    public void setRawToStationId(String rawToStationId) {
        this.rawToStationId = rawToStationId == null ? null : rawToStationId.trim();
    }

    public String getRawToStationName() {
        return rawToStationName;
    }

    public void setRawToStationName(String rawToStationName) {
        this.rawToStationName = rawToStationName == null ? null : rawToStationName.trim();
    }

    public String getRawUnitId() {
        return rawUnitId;
    }

    public void setRawUnitId(String rawUnitId) {
        this.rawUnitId = rawUnitId == null ? null : rawUnitId.trim();
    }

    public String getRawUnitName() {
        return rawUnitName;
    }

    public void setRawUnitName(String rawUnitName) {
        this.rawUnitName = rawUnitName == null ? null : rawUnitName.trim();
    }

    public String getPkgOrderStatus() {
        return pkgOrderStatus;
    }

    public void setPkgOrderStatus(String pkgOrderStatus) {
        this.pkgOrderStatus = pkgOrderStatus == null ? null : pkgOrderStatus.trim();
    }

    public Date getPkgConfirmDate() {
        return pkgConfirmDate;
    }

    public void setPkgConfirmDate(Date pkgConfirmDate) {
        this.pkgConfirmDate = pkgConfirmDate;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName == null ? null : pkgName.trim();
    }

    public String getPkgDesc() {
        return pkgDesc;
    }

    public void setPkgDesc(String pkgDesc) {
        this.pkgDesc = pkgDesc == null ? null : pkgDesc.trim();
    }

    public String getPkgDescInternal() {
        return pkgDescInternal;
    }

    public void setPkgDescInternal(String pkgDescInternal) {
        this.pkgDescInternal = pkgDescInternal == null ? null : pkgDescInternal.trim();
    }

    public String getPkgRefundDesc() {
        return pkgRefundDesc;
    }

    public void setPkgRefundDesc(String pkgRefundDesc) {
        this.pkgRefundDesc = pkgRefundDesc == null ? null : pkgRefundDesc.trim();
    }

    public String getPkgType() {
        return pkgType;
    }

    public void setPkgType(String pkgType) {
        this.pkgType = pkgType == null ? null : pkgType.trim();
    }

    public String getPkgSms() {
        return pkgSms;
    }

    public void setPkgSms(String pkgSms) {
        this.pkgSms = pkgSms == null ? null : pkgSms.trim();
    }

    public String getTicketUseStatus() {
        return ticketUseStatus;
    }

    public void setTicketUseStatus(String ticketUseStatus) {
        this.ticketUseStatus = ticketUseStatus == null ? null : ticketUseStatus.trim();
    }

    public Long getOriginExOrderIdIndex() {
        return originExOrderIdIndex;
    }

    public void setOriginExOrderIdIndex(Long originExOrderIdIndex) {
        this.originExOrderIdIndex = originExOrderIdIndex;
    }

    public String getOriginExOrderId() {
        return originExOrderId;
    }

    public void setOriginExOrderId(String originExOrderId) {
        this.originExOrderId = originExOrderId == null ? null : originExOrderId.trim();
    }

    public Double getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(Double settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    public Double getSettlementRebate() {
        return settlementRebate;
    }

    public void setSettlementRebate(Double settlementRebate) {
        this.settlementRebate = settlementRebate;
    }

    public String getSalePriceCalType() {
        return salePriceCalType;
    }

    public void setSalePriceCalType(String salePriceCalType) {
        this.salePriceCalType = salePriceCalType == null ? null : salePriceCalType.trim();
    }

    public Double getPkgSalePrice() {
        return pkgSalePrice;
    }

    public void setPkgSalePrice(Double pkgSalePrice) {
        this.pkgSalePrice = pkgSalePrice;
    }

    public String getPkgTypeName() {
        return pkgTypeName;
    }

    public void setPkgTypeName(String pkgTypeName) {
        this.pkgTypeName = pkgTypeName == null ? null : pkgTypeName.trim();
    }

    public String getTicketUseStatusName() {
        return ticketUseStatusName;
    }

    public void setTicketUseStatusName(String ticketUseStatusName) {
        this.ticketUseStatusName = ticketUseStatusName == null ? null : ticketUseStatusName.trim();
    }

    public String getPkgOrderStatusName() {
        return pkgOrderStatusName;
    }

    public void setPkgOrderStatusName(String pkgOrderStatusName) {
        this.pkgOrderStatusName = pkgOrderStatusName == null ? null : pkgOrderStatusName.trim();
    }

    public Long getExBusOrderPkgId() {
        return exBusOrderPkgId;
    }

    public void setExBusOrderPkgId(Long exBusOrderPkgId) {
        this.exBusOrderPkgId = exBusOrderPkgId;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName == null ? null : carrierName.trim();
    }

    public String getSalePriceCalTypeName() {
        return salePriceCalTypeName;
    }

    public void setSalePriceCalTypeName(String salePriceCalTypeName) {
        this.salePriceCalTypeName = salePriceCalTypeName == null ? null : salePriceCalTypeName.trim();
    }

    public Long getExBusStockId() {
        return exBusStockId;
    }

    public void setExBusStockId(Long exBusStockId) {
        this.exBusStockId = exBusStockId;
    }

    public Long getPkgSaleCount() {
        return pkgSaleCount;
    }

    public void setPkgSaleCount(Long pkgSaleCount) {
        this.pkgSaleCount = pkgSaleCount;
    }

    public Long getEleSupplierId() {
        return eleSupplierId;
    }

    public void setEleSupplierId(Long eleSupplierId) {
        this.eleSupplierId = eleSupplierId;
    }

    public String getEleSupplierCode() {
        return eleSupplierCode;
    }

    public void setEleSupplierCode(String eleSupplierCode) {
        this.eleSupplierCode = eleSupplierCode == null ? null : eleSupplierCode.trim();
    }

    public String getEleSupplierName() {
        return eleSupplierName;
    }

    public void setEleSupplierName(String eleSupplierName) {
        this.eleSupplierName = eleSupplierName == null ? null : eleSupplierName.trim();
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType == null ? null : settlementType.trim();
    }

    public String getSettlementTypeName() {
        return settlementTypeName;
    }

    public void setSettlementTypeName(String settlementTypeName) {
        this.settlementTypeName = settlementTypeName == null ? null : settlementTypeName.trim();
    }

    public String getTicketUseStatusSynStatus() {
        return ticketUseStatusSynStatus;
    }

    public void setTicketUseStatusSynStatus(String ticketUseStatusSynStatus) {
        this.ticketUseStatusSynStatus = ticketUseStatusSynStatus == null ? null : ticketUseStatusSynStatus.trim();
    }

    public Date getTicketUseStatusCheckedDate() {
        return ticketUseStatusCheckedDate;
    }

    public void setTicketUseStatusCheckedDate(Date ticketUseStatusCheckedDate) {
        this.ticketUseStatusCheckedDate = ticketUseStatusCheckedDate;
    }

    public Date getTicketUseStatusRefundDate() {
        return ticketUseStatusRefundDate;
    }

    public void setTicketUseStatusRefundDate(Date ticketUseStatusRefundDate) {
        this.ticketUseStatusRefundDate = ticketUseStatusRefundDate;
    }

    public Date getTicketUseStatusInvalidDate() {
        return ticketUseStatusInvalidDate;
    }

    public void setTicketUseStatusInvalidDate(Date ticketUseStatusInvalidDate) {
        this.ticketUseStatusInvalidDate = ticketUseStatusInvalidDate;
    }

    public String getTicketUseStatusCheckedOp() {
        return ticketUseStatusCheckedOp;
    }

    public void setTicketUseStatusCheckedOp(String ticketUseStatusCheckedOp) {
        this.ticketUseStatusCheckedOp = ticketUseStatusCheckedOp == null ? null : ticketUseStatusCheckedOp.trim();
    }

    public String getTicketUseStatusRefundOp() {
        return ticketUseStatusRefundOp;
    }

    public void setTicketUseStatusRefundOp(String ticketUseStatusRefundOp) {
        this.ticketUseStatusRefundOp = ticketUseStatusRefundOp == null ? null : ticketUseStatusRefundOp.trim();
    }

    public String getTicketUseStatusInvalidOp() {
        return ticketUseStatusInvalidOp;
    }

    public void setTicketUseStatusInvalidOp(String ticketUseStatusInvalidOp) {
        this.ticketUseStatusInvalidOp = ticketUseStatusInvalidOp == null ? null : ticketUseStatusInvalidOp.trim();
    }

    public Double getTicketRefundAmountSys() {
        return ticketRefundAmountSys;
    }

    public void setTicketRefundAmountSys(Double ticketRefundAmountSys) {
        this.ticketRefundAmountSys = ticketRefundAmountSys;
    }

    public Double getTicketRefundFeeSys() {
        return ticketRefundFeeSys;
    }

    public void setTicketRefundFeeSys(Double ticketRefundFeeSys) {
        this.ticketRefundFeeSys = ticketRefundFeeSys;
    }

    public String getTicketUseStatusSynStatusN() {
        return ticketUseStatusSynStatusN;
    }

    public void setTicketUseStatusSynStatusN(String ticketUseStatusSynStatusN) {
        this.ticketUseStatusSynStatusN = ticketUseStatusSynStatusN == null ? null : ticketUseStatusSynStatusN.trim();
    }
}