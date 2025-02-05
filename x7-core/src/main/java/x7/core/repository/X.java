/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package x7.core.repository;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 
 * @author Sim
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE}) 
public @interface X {
	
	int KEY_ONE = 1;
	
	/**
	 * just string(60<=length < 512), datetime, text<br>
	 * only effect on getter<br>
	 */
	String type() default "";
	/**
	 * 
	 * only effect on getter<br>
	 */
	int length() default 60;
	
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD, ElementType.TYPE}) 
	@interface Mapping {
		String value() default "";
	}

	/**
	 *
	 * Tranform table and column defined in SchemaTransform
	 *
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE})
	@interface Transformable{
	}


	/**
	 * 
	 * not cached two
	 *
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE})
	@interface NoCache{
	}
	
	/**
	 * 
	 * only effect on property<br>
	 * will not save the property in relation DB, like MySql<br>
	 * but will save the property int cache, or K-V DB,like mc or redis<br>
	 * instead of "transient", while transport the stream of object
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@interface Ignore{
	}
	

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD})
	@interface Key{
	}

}
