SUMMARY = "The calver package is a setuptools extension for automatically defining your Python package version as a calendar version."
HOMEPAGE = "https://github.com/di/calver"
AUTHOR = "Dustin Ingram <di@python.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI[sha256sum] = "e05493a3b17517ef1748fbe610da11f10485faa7c416b9d33fd4a52d74894f8b"

PYPI_PACKAGE = "calver"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = ""

BBCLASSEXTEND = "native nativesdk"