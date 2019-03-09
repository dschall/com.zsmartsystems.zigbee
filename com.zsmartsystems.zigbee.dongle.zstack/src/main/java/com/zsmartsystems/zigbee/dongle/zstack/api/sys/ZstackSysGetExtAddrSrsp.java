/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.zstack.api.sys;

import com.zsmartsystems.zigbee.IeeeAddress;
import com.zsmartsystems.zigbee.dongle.zstack.api.ZstackFrameResponse;

/**
 * Class to implement the Z-Stack command <b>SYS_GET_EXT_ADDR</b>.
 * <p>
 * This command is used to set the extended address of the device.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson
 */
public class ZstackSysGetExtAddrSrsp extends ZstackFrameResponse {

    /**
     * The device’s extended address.
     */
    private IeeeAddress extAddress;

    /**
     * Response and Handler constructor
     */
    public ZstackSysGetExtAddrSrsp(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        synchronousCommand = true;

        // Deserialize the fields
        extAddress = deserializeIeeeAddress();
    }

    /**
     * The device’s extended address.
     *
     * @return the current extAddress as {@link IeeeAddress}
     */
    public IeeeAddress getExtAddress() {
        return extAddress;
    }

    /**
     * The device’s extended address.
     *
     * @param extAddress the ExtAddress to set as {@link IeeeAddress}
     */
    public void setExtAddress(IeeeAddress extAddress) {
        this.extAddress = extAddress;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(51);
        builder.append("ZstackSysGetExtAddrSrsp [extAddress=");
        builder.append(extAddress);
        builder.append(']');
        return builder.toString();
    }
}
