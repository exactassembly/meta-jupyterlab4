
SUMMARY = "Python client for the Prometheus monitoring system."
HOMEPAGE = "https://github.com/prometheus/client_python"
AUTHOR = "Brian Brazil <brian.brazil@robustperception.io>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI[sha256sum] = "21e674f39831ae3f8acde238afd9a27a37d0d2fb5a28ea094f0ce25d2cbf2091"

PYPI_PACKAGE = "prometheus_client"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"