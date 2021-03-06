/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDisk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDiskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object containing information about the disk.
     * </p>
     */
    private Disk disk;

    /**
     * <p>
     * An object containing information about the disk.
     * </p>
     * 
     * @param disk
     *        An object containing information about the disk.
     */

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    /**
     * <p>
     * An object containing information about the disk.
     * </p>
     * 
     * @return An object containing information about the disk.
     */

    public Disk getDisk() {
        return this.disk;
    }

    /**
     * <p>
     * An object containing information about the disk.
     * </p>
     * 
     * @param disk
     *        An object containing information about the disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiskResult withDisk(Disk disk) {
        setDisk(disk);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDisk() != null)
            sb.append("Disk: ").append(getDisk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDiskResult == false)
            return false;
        GetDiskResult other = (GetDiskResult) obj;
        if (other.getDisk() == null ^ this.getDisk() == null)
            return false;
        if (other.getDisk() != null && other.getDisk().equals(this.getDisk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisk() == null) ? 0 : getDisk().hashCode());
        return hashCode;
    }

    @Override
    public GetDiskResult clone() {
        try {
            return (GetDiskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
