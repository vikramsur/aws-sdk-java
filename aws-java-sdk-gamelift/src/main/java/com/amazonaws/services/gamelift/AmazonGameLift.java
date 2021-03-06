/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.gamelift;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.gamelift.model.*;

/**
 * Interface for accessing Amazon GameLift.
 * <p>
 * <fullname>Amazon GameLift Service</fullname>
 * <p>
 * Welcome to the <i>Amazon GameLift API Reference</i>. Amazon GameLift is a
 * managed Amazon Web Services (AWS) service for developers who need a scalable,
 * server-based solution for multiplayer games. Amazon GameLift provides setup
 * and deployment of game servers, and handles infrastructure scaling and
 * session management. For more information about the GameLift service,
 * including a feature overview, getting started guide, and tutorial, see the
 * accompanying <a
 * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">Amazon
 * GameLift Developer Guide</a>.
 * </p>
 * <p>
 * This reference describes the low-level service API for GameLift. You can call
 * this API directly or use the <a href="https://aws.amazon.com/tools/">AWS
 * SDK</a> for your preferred language. The AWS SDK includes a set of high-level
 * GameLift actions multiplayer game sessions. Alternatively, you can use the <a
 * href="https://aws.amazon.com/cli/">AWS command-line interface</a> (CLI) tool,
 * which includes commands for GameLift. For administrative actions, you can use
 * the Amazon GameLift console.
 * </p>
 * <p>
 * <b>Managing Game and Player Sessions Through GameLift</b>
 * </p>
 * <p>
 * Call these actions from your game clients and/or services to create and
 * manage multiplayer game sessions.
 * </p>
 * <ul>
 * <li><b>Game sessions</b>
 * <ul>
 * <li><a>CreateGameSession</a></li>
 * <li><a>DescribeGameSessions</a></li>
 * <li><a>DescribeGameSessionDetails</a></li>
 * <li><a>UpdateGameSession</a></li>
 * </ul>
 * </li>
 * <li><b>Player sessions</b>
 * <ul>
 * <li><a>CreatePlayerSession</a></li>
 * <li><a>CreatePlayerSessions</a></li>
 * <li><a>DescribePlayerSessions</a></li>
 * </ul>
 * </li>
 * <li><b>Other actions:</b>
 * <ul>
 * <li><a>GetGameSessionLogUrl</a></li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * <b>Setting Up Game Servers</b>
 * </p>
 * <p>
 * Use these administrative actions to configure GameLift to host your game
 * servers. When configuring GameLift, you'll need to (1) configure a build for
 * your game and provide build files, and (2) set up one or more fleets to host
 * game sessions.
 * </p>
 * <ul>
 * <li><b>Build actions:</b>
 * <ul>
 * <li><a>ListBuilds</a></li>
 * <li><a>CreateBuild</a></li>
 * <li><a>DescribeBuild</a></li>
 * <li><a>UpdateBuild</a></li>
 * <li><a>DeleteBuild</a></li>
 * <li><a>RequestUploadCredentials</a></li>
 * </ul>
 * </li>
 * <li><b>Fleet actions:</b>
 * <ul>
 * <li><a>ListFleets</a></li>
 * <li><a>CreateFleet</a></li>
 * <li>Describe fleet actions:
 * <ul>
 * <li><a>DescribeFleetAttributes</a></li>
 * <li><a>DescribeFleetCapacity</a></li>
 * <li><a>DescribeFleetPortSettings</a></li>
 * <li><a>DescribeFleetUtilization</a></li>
 * <li><a>DescribeEC2InstanceLimits</a></li>
 * <li><a>DescribeFleetEvents</a></li>
 * </ul>
 * </li>
 * <li>Update fleet actions:
 * <ul>
 * <li><a>UpdateFleetAttributes</a></li>
 * <li><a>UpdateFleetCapacity</a></li>
 * <li><a>UpdateFleetPortSettings</a></li>
 * </ul>
 * </li>
 * <li><a>DeleteFleet</a></li>
 * </ul>
 * </li>
 * <li><b>Alias actions:</b>
 * <ul>
 * <li><a>ListAliases</a></li>
 * <li><a>CreateAlias</a></li>
 * <li><a>DescribeAlias</a></li>
 * <li><a>UpdateAlias</a></li>
 * <li><a>DeleteAlias</a></li>
 * <li><a>ResolveAlias</a></li>
 * </ul>
 * </li>
 * <li><b>Scaling policy actions:</b>
 * <ul>
 * <li><a>PutScalingPolicy</a></li>
 * <li><a>DescribeScalingPolicies</a></li>
 * <li><a>DeleteScalingPolicy</a></li>
 * </ul>
 * </li>
 * </ul>
 */
public interface AmazonGameLift {

    /**
     * The region metadata service name for computing region endpoints. You can
     * use this value to retrieve metadata (such as supported regions) of the
     * service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "gamelift";

    /**
     * Overrides the default endpoint for this client
     * ("https://gamelift.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "gamelift.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://gamelift.us-east-1.amazonaws.com"). If the protocol is not
     * specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "gamelift.us-east-1.amazonaws.com") or a full
     *        URL, including the protocol (ex:
     *        "https://gamelift.us-east-1.amazonaws.com") of the region specific
     *        AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonGameLift#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Creates an alias for a fleet. You can use an alias to anonymize your
     * fleet by referencing an alias instead of a specific fleet when you create
     * game sessions. Amazon GameLift supports two types of routing strategies
     * for aliases: simple and terminal. Use a simple alias to point to an
     * active fleet. Use a terminal alias to display a message to incoming
     * traffic instead of routing players to an active fleet. This option is
     * useful when a game server is no longer supported but you want to provide
     * better messaging than a standard 404 error.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name, routing strategy, and
     * optional description. If successful, a new alias record is returned,
     * including an alias ID, which you can reference when creating a game
     * session. To reassign the alias to another fleet ID, call
     * <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     *        Represents the input for a request action.
     * @return Result of the CreateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the
     *         allowed service limit. Please resolve the issue before retrying.
     * @sample AmazonGameLift.CreateAlias
     */
    CreateAliasResult createAlias(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Initializes a new build record and generates information required to
     * upload a game build to Amazon GameLift. Once the build record has been
     * created and is in an INITIALIZED state, you can upload your game build.
     * </p>
     * <important>
     * <p>
     * To create a build, use the CLI command <code>upload-build</code>, which
     * creates a new build record and uploads the build files in one step. (See
     * the <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">
     * Amazon GameLift Developer Guide</a> for more details on the CLI and the
     * upload process.) Call the <code>CreateBuild</code> action only if you
     * have your own Amazon Simple Storage Service (Amazon S3) client and need
     * to manually upload your build files.
     * </p>
     * </important>
     * <p>
     * To create a new build, optionally specify a build name and version. This
     * metadata is stored with other properties in the build record and is
     * displayed in the GameLift console (but not visible to players). If
     * successful, this action returns the newly created build record along with
     * an Amazon S3 storage location and AWS account credentials. Use the
     * location and credentials to upload your game build.
     * </p>
     * 
     * @param createBuildRequest
     *        Represents the input for a request action.
     * @return Result of the CreateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.CreateBuild
     */
    CreateBuildResult createBuild(CreateBuildRequest createBuildRequest);

    /**
     * <p>
     * Creates a new fleet to host game servers. A fleet consists of a set of
     * Amazon Elastic Compute Cloud (Amazon EC2) instances of a certain type,
     * which defines the CPU, memory, storage, and networking capacity of each
     * host in the fleet. See <a
     * href="https://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for more information. Each instance in the fleet hosts a game
     * server created from the specified game build. Once a fleet is in an
     * ACTIVE state, it can begin hosting game sessions.
     * </p>
     * <p>
     * To create a new fleet, provide a name and the EC2 instance type for the
     * new fleet, and specify the build and server launch path. Builds must be
     * in a READY state before they can be used to build fleets. When
     * configuring the new fleet, you can optionally (1) provide a set of launch
     * parameters to be passed to a game server when activated; (2) limit
     * incoming traffic to a specified range of IP addresses and port numbers;
     * (3) set game session protection for all instances in the fleet, and (4)
     * configure Amazon GameLift to store game session logs by specifying the
     * path to the logs stored in your game server files. If the call is
     * successful, Amazon GameLift performs the following tasks:
     * </p>
     * <ul>
     * <li>Creates a fleet record and sets the state to NEW.</li>
     * <li>Sets the fleet's capacity to 1 "desired" and 1 "active" EC2 instance
     * count.</li>
     * <li>Creates an EC2 instance and begins the process of initializing the
     * fleet and activating a game server on the instance.</li>
     * <li>Begins writing events to the fleet event log, which can be accessed
     * in the GameLift console.</li>
     * </ul>
     * <p>
     * Once a fleet is created, use the following actions to change certain
     * fleet properties (server launch parameters and log paths cannot be
     * changed):
     * </p>
     * <ul>
     * <li><a>UpdateFleetAttributes</a> -- Update fleet metadata, including name
     * and description.</li>
     * <li><a>UpdateFleetCapacity</a> -- Increase or decrease the number of
     * instances you want the fleet to maintain.</li>
     * <li><a>UpdateFleetPortSettings</a> -- Change the IP addresses and ports
     * that allow access to incoming traffic.</li>
     * </ul>
     * 
     * @param createFleetRequest
     *        Represents the input for a request action.
     * @return Result of the CreateFleet operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the
     *         allowed service limit. Please resolve the issue before retrying.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.CreateFleet
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a multiplayer game session for players. This action creates a
     * game session record and assigns the new session to an instance in the
     * specified fleet, which activates the server initialization process in
     * your game server. A fleet must be in an ACTIVE state before a game
     * session can be created for it.
     * </p>
     * <p>
     * To create a game session, specify either a fleet ID or an alias ID and
     * indicate the maximum number of players the game session allows. You can
     * also provide a name and a set of properties for your game (optional). If
     * successful, a <a>GameSession</a> object is returned containing session
     * properties, including an IP address. By default, newly created game
     * sessions are set to accept adding any new players to the game session.
     * Use <a>UpdateGameSession</a> to change the creation policy.
     * </p>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request action.
     * @return Result of the CreateGameSession operation returned by the
     *         service.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws FleetCapacityExceededException
     *         The specified fleet has no available instances to fulfill a
     *         request to create a new game session. Such requests should only
     *         be retried once the fleet capacity has been increased.
     * @sample AmazonGameLift.CreateGameSession
     */
    CreateGameSessionResult createGameSession(
            CreateGameSessionRequest createGameSessionRequest);

    /**
     * <p>
     * Adds a player to a game session and creates a player session record. A
     * game session must be in an ACTIVE state, have a creation policy of
     * ALLOW_ALL, and have an open player slot before players can be added to
     * the session.
     * </p>
     * <p>
     * To create a player session, specify a game session ID and player ID. If
     * successful, the player is added to the game session and a new
     * <a>PlayerSession</a> object is returned.
     * </p>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request action.
     * @return Result of the CreatePlayerSession operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the game
     *         instance. Such requests should not be retried by clients without
     *         resolving the conflict.
     * @throws GameSessionFullException
     *         The game instance is currently full and cannot allow the
     *         requested player(s) to join. This exception occurs in response to
     *         a <a>CreatePlayerSession</a> request.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @sample AmazonGameLift.CreatePlayerSession
     */
    CreatePlayerSessionResult createPlayerSession(
            CreatePlayerSessionRequest createPlayerSessionRequest);

    /**
     * <p>
     * Adds a group of players to a game session. Similar to
     * <a>CreatePlayerSession</a>, this action allows you to add multiple
     * players in a single call, which is useful for games that provide party
     * and/or matchmaking features. A game session must be in an ACTIVE state,
     * have a creation policy of ALLOW_ALL, and have an open player slot before
     * players can be added to the session.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID and a list of player
     * IDs. If successful, the players are added to the game session and a set
     * of new <a>PlayerSession</a> objects is returned.
     * </p>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the CreatePlayerSessions operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the game
     *         instance. Such requests should not be retried by clients without
     *         resolving the conflict.
     * @throws GameSessionFullException
     *         The game instance is currently full and cannot allow the
     *         requested player(s) to join. This exception occurs in response to
     *         a <a>CreatePlayerSession</a> request.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @sample AmazonGameLift.CreatePlayerSessions
     */
    CreatePlayerSessionsResult createPlayerSessions(
            CreatePlayerSessionsRequest createPlayerSessionsRequest);

    /**
     * <p>
     * Deletes an alias. This action removes all record of the alias; game
     * clients attempting to access a game server using the deleted alias
     * receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.DeleteAlias
     */
    DeleteAliasResult deleteAlias(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes a build. This action permanently deletes the build record and any
     * uploaded build files.
     * </p>
     * <p>
     * To delete a build, specify its ID. Deleting a build does not affect the
     * status of any active fleets, but you can no longer create new fleets for
     * the deleted build.
     * </p>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @sample AmazonGameLift.DeleteBuild
     */
    DeleteBuildResult deleteBuild(DeleteBuildRequest deleteBuildRequest);

    /**
     * <p>
     * Deletes everything related to a fleet. Before deleting a fleet, you must
     * set the fleet's desired capacity to zero. See <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * This action removes the fleet's resources and the fleet record. Once a
     * fleet is deleted, you can no longer use that fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @sample AmazonGameLift.DeleteFleet
     */
    DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes a fleet scaling policy. This action means that the policy is no
     * longer in force and removes all record of it. To delete a scaling policy,
     * specify both the scaling policy name and the fleet ID it is associated
     * with.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteScalingPolicy operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @sample AmazonGameLift.DeleteScalingPolicy
     */
    DeleteScalingPolicyResult deleteScalingPolicy(
            DeleteScalingPolicyRequest deleteScalingPolicyRequest);

    /**
     * <p>
     * Retrieves properties for a specified alias. To get the alias, specify an
     * alias ID. If successful, an <a>Alias</a> object is returned.
     * </p>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.DescribeAlias
     */
    DescribeAliasResult describeAlias(DescribeAliasRequest describeAliasRequest);

    /**
     * <p>
     * Retrieves properties for a build. To get a build record, specify a build
     * ID. If successful, an object containing the build properties is returned.
     * </p>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.DescribeBuild
     */
    DescribeBuildResult describeBuild(DescribeBuildRequest describeBuildRequest);

    /**
     * <p>
     * Retrieves the following information for the specified EC2 instance type:
     * </p>
     * <ul>
     * <li>maximum number of instances allowed per AWS account (service limit)</li>
     * <li>current usage level for the AWS account</li>
     * </ul>
     * <p>
     * Service limits vary depending on region. Available regions for GameLift
     * can be found in the AWS Management Console for GameLift (see the
     * drop-down list in the upper right corner).
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeEC2InstanceLimits operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribeEC2InstanceLimits
     */
    DescribeEC2InstanceLimitsResult describeEC2InstanceLimits(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest);

    /**
     * <p>
     * Retrieves fleet properties, including metadata, status, and
     * configuration, for one or more fleets. You can request attributes for all
     * fleets, or specify a list of one or more fleet IDs. When requesting all
     * fleets, use the pagination parameters to retrieve results as a set of
     * sequential pages. If successful, a <a>FleetAttributes</a> object is
     * returned for each requested fleet ID. When specifying a list of fleet
     * IDs, attribute objects are returned only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetAttributes operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribeFleetAttributes
     */
    DescribeFleetAttributesResult describeFleetAttributes(
            DescribeFleetAttributesRequest describeFleetAttributesRequest);

    /**
     * <p>
     * Retrieves the current status of fleet capacity for one or more fleets.
     * This information includes the number of instances that have been
     * requested for the fleet and the number currently active. You can request
     * capacity for all fleets, or specify a list of one or more fleet IDs. When
     * requesting all fleets, use the pagination parameters to retrieve results
     * as a set of sequential pages. If successful, a <a>FleetCapacity</a>
     * object is returned for each requested fleet ID. When specifying a list of
     * fleet IDs, attribute objects are returned only for fleets that currently
     * exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetCapacity operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribeFleetCapacity
     */
    DescribeFleetCapacityResult describeFleetCapacity(
            DescribeFleetCapacityRequest describeFleetCapacityRequest);

    /**
     * <p>
     * Retrieves entries from the fleet event log. You can specify a time range
     * to limit the result set. Use the pagination parameters to retrieve
     * results as a set of sequential pages. If successful, a collection of
     * event log entries matching the request are returned.
     * </p>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetEvents operation returned by the
     *         service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @sample AmazonGameLift.DescribeFleetEvents
     */
    DescribeFleetEventsResult describeFleetEvents(
            DescribeFleetEventsRequest describeFleetEventsRequest);

    /**
     * <p>
     * Retrieves the port settings for a fleet. Port settings are used to limit
     * incoming traffic access to game servers in the fleet. To get a fleet's
     * port settings, specify a fleet ID. If successful, an <a>IpPermission</a>
     * object is returned for the requested fleet ID. If the requested fleet has
     * been deleted, the result set will be empty.
     * </p>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetPortSettings operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribeFleetPortSettings
     */
    DescribeFleetPortSettingsResult describeFleetPortSettings(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest);

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. You can request
     * utilization data for all fleets, or specify a list of one or more fleet
     * IDs. When requesting all fleets, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a
     * <a>FleetUtilization</a> object is returned for each requested fleet ID.
     * When specifying a list of fleet IDs, utilization objects are returned
     * only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetUtilization operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribeFleetUtilization
     */
    DescribeFleetUtilizationResult describeFleetUtilization(
            DescribeFleetUtilizationRequest describeFleetUtilizationRequest);

    /**
     * <p>
     * Retrieves properties, including the protection policy in force, for one
     * or more game sessions. This action can be used in several ways: (1)
     * provide a <i>GameSessionId</i> to request details for a specific game
     * session; (2) provide either a <i>FleetId</i> or an <i>AliasId</i> to
     * request properties for all game sessions running on a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game
     * session ID, fleet ID, or alias ID. You can filter this request by game
     * session status. Use the pagination parameters to retrieve results as a
     * set of sequential pages. If successful, a <a>GameSessionDetail</a> object
     * is returned for each session matching the request.
     * </p>
     * 
     * @param describeGameSessionDetailsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessionDetails operation returned by
     *         the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @sample AmazonGameLift.DescribeGameSessionDetails
     */
    DescribeGameSessionDetailsResult describeGameSessionDetails(
            DescribeGameSessionDetailsRequest describeGameSessionDetailsRequest);

    /**
     * <p>
     * Retrieves properties for one or more game sessions. This action can be
     * used in several ways: (1) provide a <i>GameSessionId</i> to request
     * properties for a specific game session; (2) provide a <i>FleetId</i> or
     * an <i>AliasId</i> to request properties for all game sessions running on
     * a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game
     * session ID, fleet ID, or alias ID. You can filter this request by game
     * session status. Use the pagination parameters to retrieve results as a
     * set of sequential pages. If successful, a <a>GameSession</a> object is
     * returned for each session matching the request.
     * </p>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessions operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @sample AmazonGameLift.DescribeGameSessions
     */
    DescribeGameSessionsResult describeGameSessions(
            DescribeGameSessionsRequest describeGameSessionsRequest);

    /**
     * <p>
     * Retrieves properties for one or more player sessions. This action can be
     * used in several ways: (1) provide a <i>PlayerSessionId</i> parameter to
     * request properties for a specific player session; (2) provide a
     * <i>GameSessionId</i> parameter to request properties for all player
     * sessions in the specified game session; (3) provide a <i>PlayerId</i>
     * parameter to request properties for all player sessions of a specified
     * player.
     * </p>
     * <p>
     * To get game session record(s), specify only one of the following: a
     * player session ID, a game session ID, or a player ID. You can filter this
     * request by player session status. Use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a
     * <a>PlayerSession</a> object is returned for each session matching the
     * request.
     * </p>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribePlayerSessions operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.DescribePlayerSessions
     */
    DescribePlayerSessionsResult describePlayerSessions(
            DescribePlayerSessionsRequest describePlayerSessionsRequest);

    /**
     * <p>
     * Retrieves all scaling policies applied to a fleet.
     * </p>
     * <p>
     * To get a fleet's scaling policies, specify the fleet ID. You can filter
     * this request by policy status, such as to retrieve only active scaling
     * policies. Use the pagination parameters to retrieve results as a set of
     * sequential pages. If successful, set of <a>ScalingPolicy</a> objects is
     * returned for the fleet.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeScalingPolicies operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @sample AmazonGameLift.DescribeScalingPolicies
     */
    DescribeScalingPoliciesResult describeScalingPolicies(
            DescribeScalingPoliciesRequest describeScalingPoliciesRequest);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game
     * session. When a game session is terminated, Amazon GameLift automatically
     * stores the logs in Amazon S3. Use this URL to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift"
     * >AWS Service Limits</a> page for maximum log file sizes. Log files that
     * exceed this limit are not saved.
     * </p>
     * </note>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request action.
     * @return Result of the GetGameSessionLogUrl operation returned by the
     *         service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @sample AmazonGameLift.GetGameSessionLogUrl
     */
    GetGameSessionLogUrlResult getGameSessionLogUrl(
            GetGameSessionLogUrlRequest getGameSessionLogUrlRequest);

    /**
     * <p>
     * Retrieves a collection of alias records for this AWS account. You can
     * filter the result set by alias name and/or routing strategy type. Use the
     * pagination parameters to retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Aliases are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listAliasesRequest
     *        Represents the input for a request action.
     * @return Result of the ListAliases operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.ListAliases
     */
    ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Retrieves build records for all builds associated with an AWS account.
     * You can filter the result set by build status. Use the pagination
     * parameters to retrieve results in a set of sequential pages.
     * </p>
     * <note>
     * <p>
     * Build records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listBuildsRequest
     *        Represents the input for a request action.
     * @return Result of the ListBuilds operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.ListBuilds
     */
    ListBuildsResult listBuilds(ListBuildsRequest listBuildsRequest);

    /**
     * <p>
     * Retrieves a collection of fleet records for this AWS account. You can
     * filter the result set by build ID. Use the pagination parameters to
     * retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Fleet records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listFleetsRequest
     *        Represents the input for a request action.
     * @return Result of the ListFleets operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.ListFleets
     */
    ListFleetsResult listFleets(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Creates or updates a scaling policy for a fleet. An active scaling policy
     * prompts GameLift to track a certain metric for a fleet and automatically
     * change the fleet's capacity in specific circumstances. Each scaling
     * policy contains one rule statement. Fleets can have multiple scaling
     * policies in force simultaneously.
     * </p>
     * <p>
     * A scaling policy rule statement has the following structure:
     * </p>
     * <p>
     * If <i>[MetricName]</i> is <i>[ComparisonOperator]</i> <i>[Threshold]</i>
     * for <i>[EvaluationPeriods]</i> minutes, then
     * <i>[ScalingAdjustmentType]</i> to/by <i>[ScalingAdjustment]</i>.
     * </p>
     * <p>
     * For example, this policy:
     * "If the number of idle instances exceeds 20 for more than 15 minutes, then reduce the fleet capacity by 10 instances"
     * could be implemented as the following rule statement:
     * </p>
     * <p>
     * If [IdleInstances] is [GreaterThanOrEqualToThreshold] [20] for [15]
     * minutes, then [ChangeInCapacity] by [-10].
     * </p>
     * <p>
     * To create or update a scaling policy, specify a unique combination of
     * name and fleet ID, and set the rule values. All parameters for this
     * action are required. If successful, the policy name is returned. Scaling
     * policies cannot be suspended or made inactive. To stop enforcing a
     * scaling policy, call <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     *        Represents the input for a request action.
     * @return Result of the PutScalingPolicy operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @sample AmazonGameLift.PutScalingPolicy
     */
    PutScalingPolicyResult putScalingPolicy(
            PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Retrieves a fresh set of upload credentials and the assigned Amazon S3
     * storage location for a specific build. Valid credentials are required to
     * upload your game build files to Amazon S3.
     * </p>
     * <important>
     * <p>
     * Call this action only if you need credentials for a build created with
     * <a>CreateBuild</a>. This is a rare situation; in most cases, builds are
     * created using the CLI command <code>upload-build</code>, which creates a
     * build record and also uploads build files.
     * </p>
     * </important>
     * <p>
     * Upload credentials are returned when you create the build, but they have
     * a limited lifespan. You can get fresh credentials and use them to
     * re-upload game files until the state of that build changes to READY. Once
     * this happens, you must create a brand new build.
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request action.
     * @return Result of the RequestUploadCredentials operation returned by the
     *         service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.RequestUploadCredentials
     */
    RequestUploadCredentialsResult requestUploadCredentials(
            RequestUploadCredentialsRequest requestUploadCredentialsRequest);

    /**
     * <p>
     * Retrieves the fleet ID that a specified alias is currently pointing to.
     * </p>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request action.
     * @return Result of the ResolveAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular
     *         alias because it has a terminal <a>RoutingStrategy</a> associated
     *         with it. The message returned in this exception is the message
     *         defined in the TerminalRoutingStrategy itself. Such requests
     *         should only be retried if the routing strategy for the specified
     *         alias is modified.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.ResolveAlias
     */
    ResolveAliasResult resolveAlias(ResolveAliasRequest resolveAliasRequest);

    /**
     * <p>
     * Updates properties for an alias. To update properties, specify the alias
     * ID to be updated and provide the information to be changed. To reassign
     * an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.UpdateAlias
     */
    UpdateAliasResult updateAlias(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates metadata in a build record, including the build name and version.
     * To update the metadata, specify the build ID to update and provide the
     * new values. If successful, a build object containing the updated metadata
     * is returned.
     * </p>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @sample AmazonGameLift.UpdateBuild
     */
    UpdateBuildResult updateBuild(UpdateBuildRequest updateBuildRequest);

    /**
     * <p>
     * Updates fleet properties, including name and description, for a fleet. To
     * update metadata, specify the fleet ID and the property values you want to
     * change. If successful, the fleet ID for the updated fleet is returned.
     * </p>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetAttributes operation returned by the
     *         service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the
     *         allowed service limit. Please resolve the issue before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.UpdateFleetAttributes
     */
    UpdateFleetAttributesResult updateFleetAttributes(
            UpdateFleetAttributesRequest updateFleetAttributesRequest);

    /**
     * <p>
     * Updates capacity settings for a fleet. Use this action to specify the
     * number of EC2 instances (hosts) you want this fleet to contain. Before
     * calling this action, you may want to call
     * <a>DescribeEC2InstanceLimits</a> to get the maximum capacity based on the
     * fleet's EC2 instance type.
     * </p>
     * <p>
     * If you're using auto-scaling (see <a>PutScalingPolicy</a>), you may want
     * to specify a minimum and/or maximum capacity. If you don't provide these
     * boundaries, auto-scaling can set capacity anywhere between zero and the
     * <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift"
     * >service limits</a>.
     * </p>
     * <p>
     * To update fleet capacity, specify the fleet ID and the desired number of
     * instances. If successful, Amazon GameLift starts or terminates instances
     * so that the fleet's active instance count matches the desired instance
     * count. You can view a fleet's current capacity information by calling
     * <a>DescribeFleetCapacity</a>. If the desired instance count is higher
     * than the instance type's limit, the "Limit Exceeded" exception will
     * occur.
     * </p>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetCapacity operation returned by the
     *         service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the
     *         allowed service limit. Please resolve the issue before retrying.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.UpdateFleetCapacity
     */
    UpdateFleetCapacityResult updateFleetCapacity(
            UpdateFleetCapacityRequest updateFleetCapacityRequest);

    /**
     * <p>
     * Updates port settings for a fleet. To update settings, specify the fleet
     * ID to be updated and list the permissions you want to update. List the
     * permissions you want to add in <i>InboundPermissionAuthorizations</i>,
     * and permissions you want to remove in
     * <i>InboundPermissionRevocations</i>. Permissions to be removed must match
     * existing fleet permissions. If successful, the fleet ID for the updated
     * fleet is returned.
     * </p>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetPortSettings operation returned by the
     *         service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the fleet.
     *         Please resolve the conflict before retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the
     *         allowed service limit. Please resolve the issue before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @sample AmazonGameLift.UpdateFleetPortSettings
     */
    UpdateFleetPortSettingsResult updateFleetPortSettings(
            UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest);

    /**
     * <p>
     * Updates game session properties. This includes the session name, maximum
     * player count, protection policy, which controls whether or not an active
     * game session can be terminated during a scale-down event, and the player
     * session creation policy, which controls whether or not new players can
     * join the session. To update a game session, specify the game session ID
     * and the values you want to change. If successful, an updated
     * <a>GameSession</a> object is returned.
     * </p>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateGameSession operation returned by the
     *         service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be
     *         found. Such requests should not be retried by clients.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current
     *         state of a service resource associated with the request. Please
     *         resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while
     *         processing the request. Such requests can be retried by clients,
     *         either immediately or after a back-off period.
     * @throws UnauthorizedException
     *         The client failed authentication. Such requests should not be
     *         retried without valid authentication credentials.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current
     *         state of a resource associated with the request and/or the game
     *         instance. Such requests should not be retried by clients without
     *         resolving the conflict.
     * @throws InvalidRequestException
     *         One or more parameters specified as part of the request are
     *         invalid. Please correct the invalid parameters before retrying.
     * @sample AmazonGameLift.UpdateGameSession
     */
    UpdateGameSessionResult updateGameSession(
            UpdateGameSessionRequest updateGameSessionRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
