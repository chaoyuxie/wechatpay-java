// Copyright 2021 Tencent Inc. All rights reserved.
//
// 营销商家券对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.0.11

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.merchantexclusivecoupon.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** GetCouponNotifyRequest */
public class GetCouponNotifyRequest {
  /** 商户号 说明：商户号，不填默认查询调用方商户号 */
  @SerializedName("mchid")
  @Expose(serialize = false)
  private String mchid;

  public String getMchid() {
    return mchid;
  }

  public void setMchid(String mchid) {
    this.mchid = mchid;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCouponNotifyRequest {\n");
    sb.append("    mchid: ").append(toIndentedString(mchid)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
