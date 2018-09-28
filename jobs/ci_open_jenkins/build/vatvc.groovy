package ci_open_jenkins.build

import javaposse.jobdsl.dsl.DslFactory
import uk.gov.hmrc.jenkinsjobbuilders.domain.builder.BuildMonitorViewBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtFrontendJobBuilder
import uk.gov.hmrc.jenkinsjobs.domain.builder.SbtMicroserviceJobBuilder

new SbtMicroserviceJobBuilder('vat-agent-client-lookup-frontend').
        withScalaStyle().
        withSCoverage().
        build(this as DslFactory)

new SbtMicroserviceJobBuilder('vat-correspondence-details-frontend').
        withScalaStyle().
        withSCoverage().
        build(this as DslFactory)

new SbtMicroserviceJobBuilder('vat-obligations-dynamic-stub').
        withScalaStyle().
        withSCoverage().
        build(this as DslFactory)

new BuildMonitorViewBuilder('VATVC-MONITOR').withJobs(
        'vat-agent-client-lookup-frontend',
        'vat-correspondence-details-frontend',
        'vat-obligations-dynamic-stub',
        'financial-transactions',
        'financial-transactions-dynamic-stub'
).build(this)
