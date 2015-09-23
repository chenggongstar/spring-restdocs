/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.restdocs.mockmvc;

import org.springframework.test.web.servlet.setup.MockMvcConfigurer;

/**
 * A configurer that is nested and, therefore, has a parent.
 *
 * @param <PARENT> The parent's type
 * @author Andy Wilkinson
 */
interface NestedConfigurer<PARENT extends MockMvcConfigurer> {

	/**
	 * Returns the configurer's parent.
	 *
	 * @return the parent
	 */
	PARENT and();
}
