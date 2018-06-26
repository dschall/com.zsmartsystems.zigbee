/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.IeeeAddress;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameRequest;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspSerializer;

/**
 * Class to implement the Ember EZSP command <b>removeDevice</b>.
 * <p>
 * This command sends an APS remove device using APS encryption to the destination indicating
 * either to remove itself from the network, or one of its children.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspRemoveDeviceRequest extends EzspFrameRequest {
    public static final int FRAME_ID = 0xA8;

    /**
     * The node ID of the device that will receive the message
     * <p>
     * EZSP type is <i>EmberNodeId</i> - Java type is {@link int}
     */
    private int destShort;

    /**
     * The long address (EUI64) of the device that will receive the message.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     */
    private IeeeAddress destLong;

    /**
     * The long address (EUI64) of the device to be removed.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     */
    private IeeeAddress targetLong;

    /**
     * Serialiser used to seialise to binary line data
     */
    private EzspSerializer serializer;

    /**
     * Request constructor
     */
    public EzspRemoveDeviceRequest() {
        frameId = FRAME_ID;
        serializer = new EzspSerializer();
    }

    /**
     * The node ID of the device that will receive the message
     * <p>
     * EZSP type is <i>EmberNodeId</i> - Java type is {@link int}
     *
     * @return the current destShort as {@link int}
     */
    public int getDestShort() {
        return destShort;
    }

    /**
     * The node ID of the device that will receive the message
     *
     * @param destShort the destShort to set as {@link int}
     */
    public void setDestShort(int destShort) {
        this.destShort = destShort;
    }

    /**
     * The long address (EUI64) of the device that will receive the message.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     *
     * @return the current destLong as {@link IeeeAddress}
     */
    public IeeeAddress getDestLong() {
        return destLong;
    }

    /**
     * The long address (EUI64) of the device that will receive the message.
     *
     * @param destLong the destLong to set as {@link IeeeAddress}
     */
    public void setDestLong(IeeeAddress destLong) {
        this.destLong = destLong;
    }

    /**
     * The long address (EUI64) of the device to be removed.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     *
     * @return the current targetLong as {@link IeeeAddress}
     */
    public IeeeAddress getTargetLong() {
        return targetLong;
    }

    /**
     * The long address (EUI64) of the device to be removed.
     *
     * @param targetLong the targetLong to set as {@link IeeeAddress}
     */
    public void setTargetLong(IeeeAddress targetLong) {
        this.targetLong = targetLong;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(serializer);

        // Serialize the fields
        serializer.serializeUInt16(destShort);
        serializer.serializeEmberEui64(destLong);
        serializer.serializeEmberEui64(targetLong);
        return serializer.getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(101);
        builder.append("EzspRemoveDeviceRequest [destShort=");
        builder.append(destShort);
        builder.append(", destLong=");
        builder.append(destLong);
        builder.append(", targetLong=");
        builder.append(targetLong);
        builder.append(']');
        return builder.toString();
    }
}