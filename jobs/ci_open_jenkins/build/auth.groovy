package ci_open_jenkins.build

import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobbuilders.domain.builder.BuildMonitorViewBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtLibraryJobBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtMicroserviceJobBuilder

new SbtLibraryJobBuilder('http-caching-client').
        build(this as DslFactory)

new SbtLibraryJobBuilder('json-encryption').
        build(this as DslFactory)

new SbtLibraryJobBuilder('secure').
        build(this as DslFactory)

new SbtLibraryJobBuilder('crypto').
        build(this as DslFactory)

new SbtLibraryJobBuilder('passcode-verification').
        build(this as DslFactory)

new SbtLibraryJobBuilder('reactivemongo-json').
        withoutJUnitReports().
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-json-logger').
        withoutJUnitReports().
        build(this as DslFactory)

new SbtLibraryJobBuilder('Play-Reactivemongo').
        build(this as DslFactory)

new SbtLibraryJobBuilder('mongo-caching').
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-breadcrumb').
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-config').
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-filters').
        build(this as DslFactory)

new SbtLibraryJobBuilder('domain').
        build(this as DslFactory)

new SbtLibraryJobBuilder('http-exceptions').
        withoutJUnitReports().
        build(this as DslFactory)

new SbtMicroserviceJobBuilder('openid-connect-userinfo')
        .withTests("test it:test")
        .build(this as DslFactory)

new SbtLibraryJobBuilder('play-graphite').
        withoutJUnitReports().
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-authorised-frontend').
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-authorisation').
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-auth').
        build(this as DslFactory)

new SbtLibraryJobBuilder('play-authorisation-httpverbs-hotfix', 'play-authorisation', 'hotfix/httpverbs').
        build(this as DslFactory)

new SbtLibraryJobBuilder('dynamic-stub').
        build(this as DslFactory)

new SbtLibraryJobBuilder('tax-year').
        build(this as DslFactory)

new BuildMonitorViewBuilder('AUTH-MONITOR')
        .withJobs(
            'crypto',
            'passcode-verification',
            'domain',
            'http-exceptions',
            'json-encryption',
            'mongo-caching',
            'openid-connect-userinfo',
            'play-auth',
            'play-authorisation',
            'play-authorised-frontend',
            'secure',
            'tax-year'
        )
        .build(this)
