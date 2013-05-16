/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#createStack(CreateStackRequest) CreateStack operation}.
 * <p>
 * Creates a new stack. For more information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html"> Create a New
 * Stack </a> .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#createStack(CreateStackRequest)
 */
public class CreateStackRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The stack name.
     */
    private String name;

    /**
     * The stack AWS region, such as "us-east-1". For more information about
     * Amazon regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String region;

    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes bag.
     */
    private java.util.Map<String,String> attributes;

    /**
     * The stack AWS Identity and Access Management (IAM) role, which allows
     * OpsWorks to work with AWS resources on your behalf. You must set this
     * parameter to the Amazon Resource Name (ARN) for an existing IAM role.
     * For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     */
    private String serviceRoleArn;

    /**
     * The ARN of an IAM profile that is the default profile for all of the
     * stack's EC2 instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     */
    private String defaultInstanceProfileArn;

    /**
     * The cloned stack default operating system, which must be either
     * "Amazon Linux" or "Ubuntu 12.04 LTS".
     */
    private String defaultOs;

    /**
     * The stack's host name theme, with spaces are replaced by underscores.
     * The theme is used to generate hostnames for the stack's instances. By
     * default, <code>HostnameTheme</code> is set to Layer_Dependent, which
     * creates hostnames by appending integers to the layer's shortname. The
     * other themes are: <ul> <li>Baked_Goods</li> <li>Clouds</li>
     * <li>European_Cities</li> <li>Fruits</li> <li>Greek_Deities</li>
     * <li>Legendary_Creatures_from_Japan</li> <li>Planets_and_Moons</li>
     * <li>Roman_Deities</li> <li>Scottish_Islands</li> <li>US_Cities</li>
     * <li>Wild_Cats</li> </ul> <p>To obtain a generated hostname, call
     * <code>GetHostNameSuggestion</code>, which returns a hostname based on
     * the current theme.
     */
    private String hostnameTheme;

    /**
     * The stack default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     */
    private String defaultAvailabilityZone;

    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">
     * Use Custom JSON to Modify the Stack Configuration JSON</a>.
     */
    private String customJson;

    /**
     * Whether the stack uses custom cookbooks.
     */
    private Boolean useCustomCookbooks;

    /**
     * Contains the information required to retrieve an app or cookbook from
     * a repository. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     * Apps</a> or <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-installingcustom.html">Custom
     * Recipes and Cookbooks</a>.
     */
    private Source customCookbooksSource;

    /**
     * A default SSH key for the stack instances. You can override this value
     * when you create or update an instance.
     */
    private String defaultSshKeyName;

    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     */
    private String defaultRootDeviceType;

    /**
     * The stack name.
     *
     * @return The stack name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The stack name.
     *
     * @param name The stack name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The stack name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The stack name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * The stack AWS region, such as "us-east-1". For more information about
     * Amazon regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @return The stack AWS region, such as "us-east-1". For more information about
     *         Amazon regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * The stack AWS region, such as "us-east-1". For more information about
     * Amazon regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @param region The stack AWS region, such as "us-east-1". For more information about
     *         Amazon regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * The stack AWS region, such as "us-east-1". For more information about
     * Amazon regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param region The stack AWS region, such as "us-east-1". For more information about
     *         Amazon regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withRegion(String region) {
        this.region = region;
        return this;
    }
    
    
    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes bag.
     *
     * @return One or more user-defined key/value pairs to be added to the stack
     *         attributes bag.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;

    }
    
    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes bag.
     *
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     *         attributes bag.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes bag.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     *         attributes bag.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }
    
    /**
     * The stack AWS Identity and Access Management (IAM) role, which allows
     * OpsWorks to work with AWS resources on your behalf. You must set this
     * parameter to the Amazon Resource Name (ARN) for an existing IAM role.
     * For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @return The stack AWS Identity and Access Management (IAM) role, which allows
     *         OpsWorks to work with AWS resources on your behalf. You must set this
     *         parameter to the Amazon Resource Name (ARN) for an existing IAM role.
     *         For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public String getServiceRoleArn() {
        return serviceRoleArn;
    }
    
    /**
     * The stack AWS Identity and Access Management (IAM) role, which allows
     * OpsWorks to work with AWS resources on your behalf. You must set this
     * parameter to the Amazon Resource Name (ARN) for an existing IAM role.
     * For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @param serviceRoleArn The stack AWS Identity and Access Management (IAM) role, which allows
     *         OpsWorks to work with AWS resources on your behalf. You must set this
     *         parameter to the Amazon Resource Name (ARN) for an existing IAM role.
     *         For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }
    
    /**
     * The stack AWS Identity and Access Management (IAM) role, which allows
     * OpsWorks to work with AWS resources on your behalf. You must set this
     * parameter to the Amazon Resource Name (ARN) for an existing IAM role.
     * For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceRoleArn The stack AWS Identity and Access Management (IAM) role, which allows
     *         OpsWorks to work with AWS resources on your behalf. You must set this
     *         parameter to the Amazon Resource Name (ARN) for an existing IAM role.
     *         For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }
    
    
    /**
     * The ARN of an IAM profile that is the default profile for all of the
     * stack's EC2 instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @return The ARN of an IAM profile that is the default profile for all of the
     *         stack's EC2 instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public String getDefaultInstanceProfileArn() {
        return defaultInstanceProfileArn;
    }
    
    /**
     * The ARN of an IAM profile that is the default profile for all of the
     * stack's EC2 instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     *
     * @param defaultInstanceProfileArn The ARN of an IAM profile that is the default profile for all of the
     *         stack's EC2 instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     */
    public void setDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
    }
    
    /**
     * The ARN of an IAM profile that is the default profile for all of the
     * stack's EC2 instances. For more information about IAM ARNs, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     * Identifiers</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultInstanceProfileArn The ARN of an IAM profile that is the default profile for all of the
     *         stack's EC2 instances. For more information about IAM ARNs, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html">Using
     *         Identifiers</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withDefaultInstanceProfileArn(String defaultInstanceProfileArn) {
        this.defaultInstanceProfileArn = defaultInstanceProfileArn;
        return this;
    }
    
    
    /**
     * The cloned stack default operating system, which must be either
     * "Amazon Linux" or "Ubuntu 12.04 LTS".
     *
     * @return The cloned stack default operating system, which must be either
     *         "Amazon Linux" or "Ubuntu 12.04 LTS".
     */
    public String getDefaultOs() {
        return defaultOs;
    }
    
    /**
     * The cloned stack default operating system, which must be either
     * "Amazon Linux" or "Ubuntu 12.04 LTS".
     *
     * @param defaultOs The cloned stack default operating system, which must be either
     *         "Amazon Linux" or "Ubuntu 12.04 LTS".
     */
    public void setDefaultOs(String defaultOs) {
        this.defaultOs = defaultOs;
    }
    
    /**
     * The cloned stack default operating system, which must be either
     * "Amazon Linux" or "Ubuntu 12.04 LTS".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultOs The cloned stack default operating system, which must be either
     *         "Amazon Linux" or "Ubuntu 12.04 LTS".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withDefaultOs(String defaultOs) {
        this.defaultOs = defaultOs;
        return this;
    }
    
    
    /**
     * The stack's host name theme, with spaces are replaced by underscores.
     * The theme is used to generate hostnames for the stack's instances. By
     * default, <code>HostnameTheme</code> is set to Layer_Dependent, which
     * creates hostnames by appending integers to the layer's shortname. The
     * other themes are: <ul> <li>Baked_Goods</li> <li>Clouds</li>
     * <li>European_Cities</li> <li>Fruits</li> <li>Greek_Deities</li>
     * <li>Legendary_Creatures_from_Japan</li> <li>Planets_and_Moons</li>
     * <li>Roman_Deities</li> <li>Scottish_Islands</li> <li>US_Cities</li>
     * <li>Wild_Cats</li> </ul> <p>To obtain a generated hostname, call
     * <code>GetHostNameSuggestion</code>, which returns a hostname based on
     * the current theme.
     *
     * @return The stack's host name theme, with spaces are replaced by underscores.
     *         The theme is used to generate hostnames for the stack's instances. By
     *         default, <code>HostnameTheme</code> is set to Layer_Dependent, which
     *         creates hostnames by appending integers to the layer's shortname. The
     *         other themes are: <ul> <li>Baked_Goods</li> <li>Clouds</li>
     *         <li>European_Cities</li> <li>Fruits</li> <li>Greek_Deities</li>
     *         <li>Legendary_Creatures_from_Japan</li> <li>Planets_and_Moons</li>
     *         <li>Roman_Deities</li> <li>Scottish_Islands</li> <li>US_Cities</li>
     *         <li>Wild_Cats</li> </ul> <p>To obtain a generated hostname, call
     *         <code>GetHostNameSuggestion</code>, which returns a hostname based on
     *         the current theme.
     */
    public String getHostnameTheme() {
        return hostnameTheme;
    }
    
    /**
     * The stack's host name theme, with spaces are replaced by underscores.
     * The theme is used to generate hostnames for the stack's instances. By
     * default, <code>HostnameTheme</code> is set to Layer_Dependent, which
     * creates hostnames by appending integers to the layer's shortname. The
     * other themes are: <ul> <li>Baked_Goods</li> <li>Clouds</li>
     * <li>European_Cities</li> <li>Fruits</li> <li>Greek_Deities</li>
     * <li>Legendary_Creatures_from_Japan</li> <li>Planets_and_Moons</li>
     * <li>Roman_Deities</li> <li>Scottish_Islands</li> <li>US_Cities</li>
     * <li>Wild_Cats</li> </ul> <p>To obtain a generated hostname, call
     * <code>GetHostNameSuggestion</code>, which returns a hostname based on
     * the current theme.
     *
     * @param hostnameTheme The stack's host name theme, with spaces are replaced by underscores.
     *         The theme is used to generate hostnames for the stack's instances. By
     *         default, <code>HostnameTheme</code> is set to Layer_Dependent, which
     *         creates hostnames by appending integers to the layer's shortname. The
     *         other themes are: <ul> <li>Baked_Goods</li> <li>Clouds</li>
     *         <li>European_Cities</li> <li>Fruits</li> <li>Greek_Deities</li>
     *         <li>Legendary_Creatures_from_Japan</li> <li>Planets_and_Moons</li>
     *         <li>Roman_Deities</li> <li>Scottish_Islands</li> <li>US_Cities</li>
     *         <li>Wild_Cats</li> </ul> <p>To obtain a generated hostname, call
     *         <code>GetHostNameSuggestion</code>, which returns a hostname based on
     *         the current theme.
     */
    public void setHostnameTheme(String hostnameTheme) {
        this.hostnameTheme = hostnameTheme;
    }
    
    /**
     * The stack's host name theme, with spaces are replaced by underscores.
     * The theme is used to generate hostnames for the stack's instances. By
     * default, <code>HostnameTheme</code> is set to Layer_Dependent, which
     * creates hostnames by appending integers to the layer's shortname. The
     * other themes are: <ul> <li>Baked_Goods</li> <li>Clouds</li>
     * <li>European_Cities</li> <li>Fruits</li> <li>Greek_Deities</li>
     * <li>Legendary_Creatures_from_Japan</li> <li>Planets_and_Moons</li>
     * <li>Roman_Deities</li> <li>Scottish_Islands</li> <li>US_Cities</li>
     * <li>Wild_Cats</li> </ul> <p>To obtain a generated hostname, call
     * <code>GetHostNameSuggestion</code>, which returns a hostname based on
     * the current theme.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostnameTheme The stack's host name theme, with spaces are replaced by underscores.
     *         The theme is used to generate hostnames for the stack's instances. By
     *         default, <code>HostnameTheme</code> is set to Layer_Dependent, which
     *         creates hostnames by appending integers to the layer's shortname. The
     *         other themes are: <ul> <li>Baked_Goods</li> <li>Clouds</li>
     *         <li>European_Cities</li> <li>Fruits</li> <li>Greek_Deities</li>
     *         <li>Legendary_Creatures_from_Japan</li> <li>Planets_and_Moons</li>
     *         <li>Roman_Deities</li> <li>Scottish_Islands</li> <li>US_Cities</li>
     *         <li>Wild_Cats</li> </ul> <p>To obtain a generated hostname, call
     *         <code>GetHostNameSuggestion</code>, which returns a hostname based on
     *         the current theme.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withHostnameTheme(String hostnameTheme) {
        this.hostnameTheme = hostnameTheme;
        return this;
    }
    
    
    /**
     * The stack default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @return The stack default Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public String getDefaultAvailabilityZone() {
        return defaultAvailabilityZone;
    }
    
    /**
     * The stack default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     *
     * @param defaultAvailabilityZone The stack default Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     */
    public void setDefaultAvailabilityZone(String defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
    }
    
    /**
     * The stack default Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     * and Endpoints</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultAvailabilityZone The stack default Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions
     *         and Endpoints</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withDefaultAvailabilityZone(String defaultAvailabilityZone) {
        this.defaultAvailabilityZone = defaultAvailabilityZone;
        return this;
    }
    
    
    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">
     * Use Custom JSON to Modify the Stack Configuration JSON</a>.
     *
     * @return A string that contains user-defined, custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values.
     *         The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">
     *         Use Custom JSON to Modify the Stack Configuration JSON</a>.
     */
    public String getCustomJson() {
        return customJson;
    }
    
    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">
     * Use Custom JSON to Modify the Stack Configuration JSON</a>.
     *
     * @param customJson A string that contains user-defined, custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values.
     *         The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">
     *         Use Custom JSON to Modify the Stack Configuration JSON</a>.
     */
    public void setCustomJson(String customJson) {
        this.customJson = customJson;
    }
    
    /**
     * A string that contains user-defined, custom JSON. It is used to
     * override the corresponding default stack configuration JSON values.
     * The string should be in the following format and must escape
     * characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     * \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">
     * Use Custom JSON to Modify the Stack Configuration JSON</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customJson A string that contains user-defined, custom JSON. It is used to
     *         override the corresponding default stack configuration JSON values.
     *         The string should be in the following format and must escape
     *         characters such as '"'.: <code>"{\"key1\": \"value1\", \"key2\":
     *         \"value2\",...}"</code> <p>For more information on custom JSON, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-json.html">
     *         Use Custom JSON to Modify the Stack Configuration JSON</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withCustomJson(String customJson) {
        this.customJson = customJson;
        return this;
    }
    
    
    /**
     * Whether the stack uses custom cookbooks.
     *
     * @return Whether the stack uses custom cookbooks.
     */
    public Boolean isUseCustomCookbooks() {
        return useCustomCookbooks;
    }
    
    /**
     * Whether the stack uses custom cookbooks.
     *
     * @param useCustomCookbooks Whether the stack uses custom cookbooks.
     */
    public void setUseCustomCookbooks(Boolean useCustomCookbooks) {
        this.useCustomCookbooks = useCustomCookbooks;
    }
    
    /**
     * Whether the stack uses custom cookbooks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param useCustomCookbooks Whether the stack uses custom cookbooks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withUseCustomCookbooks(Boolean useCustomCookbooks) {
        this.useCustomCookbooks = useCustomCookbooks;
        return this;
    }
    
    
    /**
     * Whether the stack uses custom cookbooks.
     *
     * @return Whether the stack uses custom cookbooks.
     */
    public Boolean getUseCustomCookbooks() {
        return useCustomCookbooks;
    }
    
    /**
     * Contains the information required to retrieve an app or cookbook from
     * a repository. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     * Apps</a> or <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-installingcustom.html">Custom
     * Recipes and Cookbooks</a>.
     *
     * @return Contains the information required to retrieve an app or cookbook from
     *         a repository. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     *         Apps</a> or <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-installingcustom.html">Custom
     *         Recipes and Cookbooks</a>.
     */
    public Source getCustomCookbooksSource() {
        return customCookbooksSource;
    }
    
    /**
     * Contains the information required to retrieve an app or cookbook from
     * a repository. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     * Apps</a> or <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-installingcustom.html">Custom
     * Recipes and Cookbooks</a>.
     *
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook from
     *         a repository. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     *         Apps</a> or <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-installingcustom.html">Custom
     *         Recipes and Cookbooks</a>.
     */
    public void setCustomCookbooksSource(Source customCookbooksSource) {
        this.customCookbooksSource = customCookbooksSource;
    }
    
    /**
     * Contains the information required to retrieve an app or cookbook from
     * a repository. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     * Apps</a> or <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-installingcustom.html">Custom
     * Recipes and Cookbooks</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customCookbooksSource Contains the information required to retrieve an app or cookbook from
     *         a repository. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating
     *         Apps</a> or <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-installingcustom.html">Custom
     *         Recipes and Cookbooks</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withCustomCookbooksSource(Source customCookbooksSource) {
        this.customCookbooksSource = customCookbooksSource;
        return this;
    }
    
    
    /**
     * A default SSH key for the stack instances. You can override this value
     * when you create or update an instance.
     *
     * @return A default SSH key for the stack instances. You can override this value
     *         when you create or update an instance.
     */
    public String getDefaultSshKeyName() {
        return defaultSshKeyName;
    }
    
    /**
     * A default SSH key for the stack instances. You can override this value
     * when you create or update an instance.
     *
     * @param defaultSshKeyName A default SSH key for the stack instances. You can override this value
     *         when you create or update an instance.
     */
    public void setDefaultSshKeyName(String defaultSshKeyName) {
        this.defaultSshKeyName = defaultSshKeyName;
    }
    
    /**
     * A default SSH key for the stack instances. You can override this value
     * when you create or update an instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultSshKeyName A default SSH key for the stack instances. You can override this value
     *         when you create or update an instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateStackRequest withDefaultSshKeyName(String defaultSshKeyName) {
        this.defaultSshKeyName = defaultSshKeyName;
        return this;
    }
    
    
    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @return The default root device type. This value is used by default for all
     *         instances in the cloned stack, but you can override it when you create
     *         an instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public String getDefaultRootDeviceType() {
        return defaultRootDeviceType;
    }
    
    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param defaultRootDeviceType The default root device type. This value is used by default for all
     *         instances in the cloned stack, but you can override it when you create
     *         an instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public void setDefaultRootDeviceType(String defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType;
    }
    
    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param defaultRootDeviceType The default root device type. This value is used by default for all
     *         instances in the cloned stack, but you can override it when you create
     *         an instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see RootDeviceType
     */
    public CreateStackRequest withDefaultRootDeviceType(String defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType;
        return this;
    }
    
    
    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param defaultRootDeviceType The default root device type. This value is used by default for all
     *         instances in the cloned stack, but you can override it when you create
     *         an instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @see RootDeviceType
     */
    public void setDefaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType.toString();
    }
    
    /**
     * The default root device type. This value is used by default for all
     * instances in the cloned stack, but you can override it when you create
     * an instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     * for the Root Device</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param defaultRootDeviceType The default root device type. This value is used by default for all
     *         instances in the cloned stack, but you can override it when you create
     *         an instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ComponentsAMIs.html#storage-for-the-root-device">Storage
     *         for the Root Device</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see RootDeviceType
     */
    public CreateStackRequest withDefaultRootDeviceType(RootDeviceType defaultRootDeviceType) {
        this.defaultRootDeviceType = defaultRootDeviceType.toString();
        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");    	
        if (getName() != null) sb.append("Name: " + getName() + ",");    	
        if (getRegion() != null) sb.append("Region: " + getRegion() + ",");    	
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");    	
        if (getServiceRoleArn() != null) sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");    	
        if (getDefaultInstanceProfileArn() != null) sb.append("DefaultInstanceProfileArn: " + getDefaultInstanceProfileArn() + ",");    	
        if (getDefaultOs() != null) sb.append("DefaultOs: " + getDefaultOs() + ",");    	
        if (getHostnameTheme() != null) sb.append("HostnameTheme: " + getHostnameTheme() + ",");    	
        if (getDefaultAvailabilityZone() != null) sb.append("DefaultAvailabilityZone: " + getDefaultAvailabilityZone() + ",");    	
        if (getCustomJson() != null) sb.append("CustomJson: " + getCustomJson() + ",");    	
        if (isUseCustomCookbooks() != null) sb.append("UseCustomCookbooks: " + isUseCustomCookbooks() + ",");    	
        if (getCustomCookbooksSource() != null) sb.append("CustomCookbooksSource: " + getCustomCookbooksSource() + ",");    	
        if (getDefaultSshKeyName() != null) sb.append("DefaultSshKeyName: " + getDefaultSshKeyName() + ",");    	
        if (getDefaultRootDeviceType() != null) sb.append("DefaultRootDeviceType: " + getDefaultRootDeviceType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultInstanceProfileArn() == null) ? 0 : getDefaultInstanceProfileArn().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultOs() == null) ? 0 : getDefaultOs().hashCode()); 
        hashCode = prime * hashCode + ((getHostnameTheme() == null) ? 0 : getHostnameTheme().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultAvailabilityZone() == null) ? 0 : getDefaultAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getCustomJson() == null) ? 0 : getCustomJson().hashCode()); 
        hashCode = prime * hashCode + ((isUseCustomCookbooks() == null) ? 0 : isUseCustomCookbooks().hashCode()); 
        hashCode = prime * hashCode + ((getCustomCookbooksSource() == null) ? 0 : getCustomCookbooksSource().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultSshKeyName() == null) ? 0 : getDefaultSshKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultRootDeviceType() == null) ? 0 : getDefaultRootDeviceType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateStackRequest == false) return false;
        CreateStackRequest other = (CreateStackRequest)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null) return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false) return false; 
        if (other.getDefaultInstanceProfileArn() == null ^ this.getDefaultInstanceProfileArn() == null) return false;
        if (other.getDefaultInstanceProfileArn() != null && other.getDefaultInstanceProfileArn().equals(this.getDefaultInstanceProfileArn()) == false) return false; 
        if (other.getDefaultOs() == null ^ this.getDefaultOs() == null) return false;
        if (other.getDefaultOs() != null && other.getDefaultOs().equals(this.getDefaultOs()) == false) return false; 
        if (other.getHostnameTheme() == null ^ this.getHostnameTheme() == null) return false;
        if (other.getHostnameTheme() != null && other.getHostnameTheme().equals(this.getHostnameTheme()) == false) return false; 
        if (other.getDefaultAvailabilityZone() == null ^ this.getDefaultAvailabilityZone() == null) return false;
        if (other.getDefaultAvailabilityZone() != null && other.getDefaultAvailabilityZone().equals(this.getDefaultAvailabilityZone()) == false) return false; 
        if (other.getCustomJson() == null ^ this.getCustomJson() == null) return false;
        if (other.getCustomJson() != null && other.getCustomJson().equals(this.getCustomJson()) == false) return false; 
        if (other.isUseCustomCookbooks() == null ^ this.isUseCustomCookbooks() == null) return false;
        if (other.isUseCustomCookbooks() != null && other.isUseCustomCookbooks().equals(this.isUseCustomCookbooks()) == false) return false; 
        if (other.getCustomCookbooksSource() == null ^ this.getCustomCookbooksSource() == null) return false;
        if (other.getCustomCookbooksSource() != null && other.getCustomCookbooksSource().equals(this.getCustomCookbooksSource()) == false) return false; 
        if (other.getDefaultSshKeyName() == null ^ this.getDefaultSshKeyName() == null) return false;
        if (other.getDefaultSshKeyName() != null && other.getDefaultSshKeyName().equals(this.getDefaultSshKeyName()) == false) return false; 
        if (other.getDefaultRootDeviceType() == null ^ this.getDefaultRootDeviceType() == null) return false;
        if (other.getDefaultRootDeviceType() != null && other.getDefaultRootDeviceType().equals(this.getDefaultRootDeviceType()) == false) return false; 
        return true;
    }
    
}
    