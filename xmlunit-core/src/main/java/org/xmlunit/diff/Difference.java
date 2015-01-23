/*
  This file is licensed to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
*/
package org.xmlunit.diff;

/**
 * Combines a {@link Comparison} and its {@link ComparisonResult result}.
 *
 * <p>As the name implies, the implicit assumption is that the result
 * is not {@link ComparisonResult#EQUAL}</p>
 */
public class Difference {

    private final ComparisonResult result;
    private final Comparison comparison;

    /**
     * Combines comparison and result.
     */
    public Difference(Comparison comparison, ComparisonResult result) {
        this.result = result;
        this.comparison = comparison;
    }

    /**
     * The result of the difference.
     */
    public ComparisonResult getResult() {
        return result;
    }

    /**
     * The details of the comparison.
     */
    public Comparison getComparison() {
        return comparison;
    }
}
