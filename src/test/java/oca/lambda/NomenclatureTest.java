/**
 * Copyright 2015-2017 Debmalya Jash
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package oca.lambda;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;



/**
 * @author debmalyajash
 *
 */
public class NomenclatureTest {

	/**
	 * Test method for {@link oca.lambda.Nomenclature#cleanNames(java.util.List)}.
	 */
	@Test
	public void testCleanNames() {
		Nomenclature nomen = new Nomenclature();
		Assert.assertEquals( "", nomen.cleanNames( null ));
		
		List<String> nameList = new ArrayList<>();
		nameList.add( "arsenal" );
		nameList.add( "evertorn" );
		Assert.assertEquals( "Arsenal,Evertorn", nomen.cleanNames( nameList ));
	}

}
