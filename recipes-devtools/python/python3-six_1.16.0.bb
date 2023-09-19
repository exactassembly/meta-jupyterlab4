SUMMARY = "Python 2 and 3 compatibility utilities"
HOMEPAGE = "https://github.com/benjaminp/six"
AUTHOR = "Benjamin Peterson <benjamin@python.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=43cfc9e4ac0e377acfb9b76f56b8415d"

SRC_URI[sha256sum] = "1e61c37477a1626458e36f7b1d82aa5c9b094fa4802892072e49de9c60c4c926"

PYPI_PACKAGE = "six"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"

