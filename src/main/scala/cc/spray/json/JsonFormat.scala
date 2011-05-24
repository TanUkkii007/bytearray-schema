/*
 * Original implementation (C) 2009-2011 Debasish Ghosh
 * Adapted and extended in 2011 by Mathias Doenitz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cc.spray.json

/**
  * Provides the JSON deserialization for type T.
 */
trait JsonReader[T] {
  def read(json: JsValue): T
}

/**
  * Provides the JSON serialization for type T.
 */
trait JsonWriter[T] {
  def write(obj: T): JsValue
}

/**
  * Provides the JSON deserialization and serialization for type T.
 */
trait JsonFormat[T] extends JsonReader[T] with JsonWriter[T]