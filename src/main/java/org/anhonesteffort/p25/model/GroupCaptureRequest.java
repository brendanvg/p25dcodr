/*
 * Copyright (C) 2015 An Honest Effort LLC, coping.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.anhonesteffort.p25.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.anhonesteffort.p25.monitor.Identifiable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class GroupCaptureRequest extends RfAttributesBase implements Identifiable {

  @NotNull @Valid private GroupChannelId channelId;

  public GroupCaptureRequest() { }

  public GroupCaptureRequest(
      Double latitude, Double longitude, Integer polarization,
      Double frequency, GroupChannelId channelId
  ) {
    super(latitude, longitude, polarization, frequency);
    this.channelId = channelId;
  }

  @Override
  @JsonProperty
  public GroupChannelId getChannelId() {
    return channelId;
  }

}
