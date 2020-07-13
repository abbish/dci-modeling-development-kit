package com.domainmodeling.dci.adk.sample.java.orderpayment.fulfillment.payment.evidence;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class AlipayPaymentConfirmationEvidence extends PaymentConfirmationEvidence {
}