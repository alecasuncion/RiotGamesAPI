
# **league-of-legends-api**
This is a passion project Java adaptation of the [Riot Games' League of Legends API](https://developer.riotgames.com)

## Resources

### ***/account/{gameName}/{tagline}***
Retrieves the Riot Account Details by using the Riot Account's Riot ID & Tagline from *Riot Games*
<table>
	<th width="160px">URI Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>gameName</td>
		<td>Riot ID of the user</td>
		<td>Required</td>
		<td></td>
	</tr>
	<tr>
		<td>tagLine</td>
		<td>Tagline beside the Riot ID(The name after the hashtag <b>#</b>)</td>
		<td>Required</td>
		<td></td>
	</tr>
</table>
<br>
<table>
	<th width="160px">Query Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>region</td>
		<td>Region of the Riot Account</td>
		<td>Optional</td>
		<td>Asia</td>
	</tr>
</table>

<br>

###  ***/account/{puuid}***
Retrieves the Riot Account Details by using the Unique Account ID from *Riot Games*
<table>
	<th width="160px">URI Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>puuid</td>
		<td>PUUID of the Riot Account</td>
		<td>Required</td>
		<td></td>
	</tr>
</table>
<br>
<table>
	<th width="160px">Query Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>region</td>
		<td>Region of the Riot Account</td>
		<td>Optional</td>
		<td>Asia</td>
	</tr>
</table>


### ***/summoner/{summonerName}***
Retrieves the Summoner Account Details by using the Summoner Name in *League of Legends*
<table>
	<th width="160px">URI Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>summonerName</td>
		<td>Summoner Name within the *League of Legends* Client</td>
		<td>Required</td>
		<td></td>
	</tr>
</table>
<br>
<table>
	<th width="160px">Query Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>platformCode</td>
		<td>Platform Code of the Summoner Account</td>
		<td>Optional</td>
		<td>JP1</td>
	</tr>
</table>


### ***/match/{matchId}***
Retrieves Match Details by using the Match ID
<table>
	<th width="160px">URI Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>matchId</td>
		<td>ID of the specific match</td>
		<td>Required</td>
		<td></td>
	</tr>
</table>
<br>
<table>
	<th width="160px">Query Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>region</td>
		<td>Region of the Riot Account</td>
		<td>Optional</td>
		<td>Asia</td>
	</tr>
</table>

### ***/matches/{puuid}***
Retrieves the list of Match Details based on the Unique Account ID from *Riot Games* and Query Parameters
<table>
	<th width="160px">URI Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>puuid</td>
		<td>PUUID of the Riot Account</td>
		<td>Required</td>
		<td></td>
	</tr>
</table>
<br>
<table>
	<th width="160px">Query Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>region</td>
		<td>Region of the Riot Account</td>
		<td>Optional</td>
		<td>Asia</td>
	</tr>
	<tr>
		<td>start</td>
		<td>Starting Index of the Match List based on the overall size of the matches under the Account</td>
		<td>Optional</td>
		<td>0</td>
	</tr>
	<tr>
		<td>count</td>
		<td>Determines the size of the list being retrieved</td>
		<td>Optional</td>
		<td>20</td>
	</tr>
	<tr>
		<td>startTime</td>
		<td>Starting DateTime(*Based on Epoch Timestamp in Seconds*) of the query</td>
		<td>Optional</td>
		<td></td>
	</tr>
	<tr>
		<td>endTime</td>
		<td>Ending DateTime(*Based on Epoch Timestamp in Seconds*) of the query</td>
		<td>Optional</td>
		<td></td>
	</tr>
</table>

### ***/matches/{puuid}/ids***
Retrieves the List of Match IDs based on the Unique Account ID from *Riot Games* and Query Parameters
<table>
	<th width="160px">URI Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>puuid</td>
		<td>PUUID of the Riot Account</td>
		<td>Required</td>
		<td></td>
	</tr>
</table>
<br>
<table>
	<th width="160px">Query Parameters</th>
	<th width="400px">Description</th>
	<th>Required</th>
	<th>Default Value</th>
	<tr>
		<td>region</td>
		<td>Region of the Riot Account</td>
		<td>Optional</td>
		<td>Asia</td>
	</tr>
	<tr>
		<td>start</td>
		<td>Starting Index of the Match List based on the overall size of the matches under the Account</td>
		<td>Optional</td>
		<td>0</td>
	</tr>
	<tr>
		<td>count</td>
		<td>Determines the size of the list being retrieved</td>
		<td>Optional</td>
		<td>20</td>
	</tr>
	<tr>
		<td>startTime</td>
		<td>Starting DateTime(*Based on Epoch Timestamp in Seconds*) of the query</td>
		<td>Optional</td>
		<td></td>
	</tr>
	<tr>
		<td>endTime</td>
		<td>Ending DateTime(*Based on Epoch Timestamp in Seconds*) of the query</td>
		<td>Optional</td>
		<td></td>
	</tr>
</table>

##  Reference 
### Regions
<table>
	<th>Region Name</th>
	<th>Region Code</th>
		<tr>
			<td>Americas</td>
			<td>America</td>
		</tr>
		<tr>
			<td>Asia</td>
			<td>Asia</td>
		</tr>
		<tr>
			<td>Europe</td>
			<td>EU</td>
		</tr>
	<tr>
		<td>South East Asia</td>
		<td>SEA</td>
	</tr>
</table>

### Platform Codes
<table>
	<th>Platform</th>
	<th>Server Location Code</th>
	<tr>
		<td>Brazil</td>
		<td>BR1</td>
	</tr>
	<tr>
		<td>Europe Nordic & East</td>
		<td>EUN1</td>
	</tr>
	<tr>
		<td>Europe West</td>
		<td>EUW1</td>
	</tr>
	<tr>
		<td>Japan</td>
		<td>JP1</td>
	</tr>
	<tr>
		<td>Republic of Korea</td>
		<td>KR</td>
	</tr>
	<tr>
		<td>Latin America North</td>
		<td>LA1</td>
	</tr>
	<tr>
		<td>Latin America South</td>
		<td>LA2</td>
	</tr>
	<tr>
		<td>North America</td>
		<td>NA1</td>
	</tr>
	<tr>
		<td>Oceania</td>
		<td>OC1</td>
	</tr>
	<tr>
		<td>Russia</td>
		<td>RU</td>
	</tr>
	<tr>
		<td>Turkey</td>
		<td>TR1</td>
	</tr>
</table>
